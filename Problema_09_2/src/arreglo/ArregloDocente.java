package arreglo;

import java.util.ArrayList;

import clase.Docente;

public class ArregloDocente {
	
	ArrayList<Docente> doc;
	
	public ArregloDocente(){
		doc =new ArrayList<Docente>();
	}
//  Operaciones públicas básicas
	public void adicionar(Docente x) {
		doc.add(x);
	}
	public int tamanio() {
		return doc.size();
	}
	public Docente obtener(int i) {
		return doc.get(i);
	}
	
	public double suldoPromedio(){
		double suma= 0.0;
		for(int i=0;i<tamanio();i++){
			suma+=obtener(i).sueldo();
		}
		return suma/tamanio();
	}
	public double sueldoMayor(){
		double mayor= 0.0;
		for(int i=0;i<tamanio();i++){
			if(mayor < obtener(i).sueldo()){
				mayor = obtener(i).sueldo();
			}
		}
		return mayor;
	}
	public double sueldoMenor(){
		double menor= 0.0;
		for(int i=0;i<tamanio();i++){
			if(menor > obtener(i).sueldo()){
				menor = obtener(i).sueldo();
			}
		}
		return menor;
	}
	public double tarifaMayor(){
		double mayor= 0.0;
		for(int i=0;i<tamanio();i++){
			if(mayor < obtener(i).getTarifa()){
				mayor = obtener(i).getTarifa();
			}
		}
		return mayor;
	}
	public double tarifaMenor(){
		double menor =obtener(0).getTarifa();
		for(int i=1;i<tamanio();i++){
			if(menor>obtener(i).getTarifa()){
				menor = obtener(i).getTarifa();
			}
		}
		return menor;
	}
}
