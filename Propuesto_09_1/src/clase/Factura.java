package clase;

public class Factura {
	private String ruc,empresa;
	private int unidades;
	private double precio_uni;
	public Factura(String ruc, String empresa, int unidades, double precio_uni) {
		super();
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precio_uni = precio_uni;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecio_uni() {
		return precio_uni;
	}
	public void setPrecio_uni(double precio_uni) {
		this.precio_uni = precio_uni;
	}
	
	public double importeFacturado() {
		return unidades*precio_uni;
	}

}
