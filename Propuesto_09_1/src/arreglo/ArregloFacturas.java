package arreglo;

import java.util.ArrayList;

import clase.Factura;

public class ArregloFacturas {
	
	ArrayList<Factura> fac;
	
	public ArregloFacturas() {
		fac=new ArrayList<Factura>();
		fac.add(new Factura("100", "Televisa", 1900, 15.1));
		fac.add(new Factura("100", "America", 1500, 14.8));
		fac.add(new Factura("100", "Dios", 1700, 192.9));
		fac.add(new Factura("100", "KFC", 1300, 188.7));
		fac.add(new Factura("100", "Louis Viton", 2000, 194.8));
		fac.add(new Factura("100", "Jorge", 1200, 138.7));
    	fac.add(new Factura("100", "MacDonals", 1500, 174.3));
    	fac.add(new Factura("100", "Algomás", 1100, 102.9));
	}
	public void adicionar(Factura f) {
		fac.add(f);
	}
	public int tamanio() {
		return fac.size();
	}
	public Factura obtener(int i) {
		return fac.get(i);
	}
	
	public double sumaImportesFacturados() {
		double suma=0.0;
		for(Factura factura : fac) {
			suma += factura.importeFacturado();
		}
		return suma;
	}
	public double importePromedioFacturado() {
		double suma=0.0;
		for(int i=0;i<tamanio();i++) {
			suma += obtener(i).importeFacturado();
		}
		if(fac.size()>0) {
			return suma /tamanio();
		}else {
			return 0.0;
		}
	}
	public double ImporteMenorFacturado() {
		double menor =obtener(0).importeFacturado();
		for(int i=1;i<tamanio();i++){
			if(menor>obtener(i).importeFacturado()){
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}
	public double ImporteMayorFacturado() {
		double mayor = 0.0;
		for(int i=0;i<tamanio();i++){
			if(mayor<obtener(i).importeFacturado()){
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}
	public String empresaMenoralPromedio() {
		double promedio = importePromedioFacturado();
		for(Factura factura : fac) {
			if(factura.importeFacturado()< promedio) {
				return factura.getEmpresa();
			}
		}
		return "Empresa no existente.";
	}
}
