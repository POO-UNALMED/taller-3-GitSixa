package taller3.televisores;

public class Control {
	
	// ATRIBUTO TV
	
	TV tv;
	
	
	// MÉTODOS GET Y SET
	
	public TV getTV () {
		return tv;
	}
	
	public void setTV (TV tv) {
		this.tv = tv;
	}
	
	
	// MÉTODOS
	
	public void turnOn () {
		tv.turnOn();
	}
	public void turnOff () {
		tv.turnOff();
	}
	
	public void canalUp () {
		tv.canalUp();
	}
	public void canalDown () {
		tv.canalDown();
	}
	
	public void volumenUp () {
		tv.volumenUp();
	}
	public void volumenDown () {
		tv.volumenDown();
	}
	
	public void setCanal (int canal) {
		tv.setCanal(canal);
	}
	
	
	// MÉTODOS
	
	public void enlazar (TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
}
