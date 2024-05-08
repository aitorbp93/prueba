package amazon;

public class Producto extends Vendedor {
	private double precio;
	private String tipoProducto;
	public Producto() {
		super();
	}
	public Producto(double precio, String tipoProducto) {
		super();
		this.precio = precio;
		this.tipoProducto = tipoProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	@Override
	public String toString() {
		return "Producto precio= " + precio + ", tipoProducto= " + tipoProducto;
	}
	

}
