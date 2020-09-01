package taller3.televisores;

public class Marca {
	
	// ATRIBUTOS
	
	String nombre;
	
	
	// MÉTODO CONSTRUCTOR
	
	public Marca (String nombre) {
		this.nombre = nombre;
	}
	
	
	// MÉTODOS GET Y SET
	
	public String getNombre () {
		return nombre;
	}
	
	public void set (String nombre) {
		this.nombre = nombre;
	}
}
