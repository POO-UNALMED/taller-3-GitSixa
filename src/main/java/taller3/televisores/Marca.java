package taller3.televisores;

public class Marca {
	
	// ATRIBUTOS
	
	private String nombre;
	
	
	// M�TODO CONSTRUCTOR
	
	public Marca (String nombre) {
		this.nombre = nombre;
	}
	
	
	// M�TODOS GET Y SET
	
	public String getNombre () {
		return nombre;
	}
	
	public void set (String nombre) {
		this.nombre = nombre;
	}
}
