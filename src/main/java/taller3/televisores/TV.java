package taller3.televisores;

public class TV {
	
	// ATRIBUTOS
	
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	
	
	// MÉTODO CONSTRUCTOR
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	
	// MÉTODOS GET Y SET
	
	public Marca getMarca () {
		return marca;
	}
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl () {
		return control;
	}
	public void setControl (Control control) {
		this.control = control;
	}
	
	public int getPrecio () {
		return precio;
	}
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getVolumen () {
		return volumen;
	}
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal () {
		return canal;
	}
	public void setCanal (int canal) {
		this.canal = canal;
	}
}
