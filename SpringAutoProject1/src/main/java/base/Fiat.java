package base;

public class Fiat implements Auto{

	private String marca;
	private String modello;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public void show() {
		System.out.println("This car is " + this.marca 
				+ " and Model is " + this.modello);
	}

}
