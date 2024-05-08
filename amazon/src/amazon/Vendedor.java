package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
	protected ArrayList<Producto> productos = new ArrayList<Producto>();
	protected ArrayList<Integer> stock = new ArrayList<Integer>();
	protected String nombreUsuario;
	protected String password;

	public Vendedor() {

	}

	public Vendedor(ArrayList<Producto> pruductos, ArrayList<Integer> stock, String nombreUsuario, String password) {

		this.productos = pruductos;
		this.stock = stock;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	public ArrayList<Producto> getPruductos() {
		return productos;
	}

	public void setPruductos(ArrayList<Producto> pruductos) {
		this.productos = pruductos;
	}

	public ArrayList<Integer> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Integer> stock) {
		this.stock = stock;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Producto pruductos= " + productos + ", stock= " + stock + ", nombreUsuario= " + nombreUsuario
				+ ", password= " + password;
	}

//metodo para el menu del vendedor
	public void menuVendedor() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Elige una opcion: \n 1-Añadir producto \n 2-Añadir producto al inventario \n 3-Ver Stock \n 4- Modificar Stock");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1: {
			agregarProducto();
			break;

		}
		case 2: {
			mostrarProducto();
			break;
		}
		default:

		}

	}

//metodo para validar el acceso como vendedor
	public void acceso() {
		Scanner sc = new Scanner(System.in);
		this.nombreUsuario = "Aitor";
		this.password = "Aitor123";
		do {
			System.out.println("Dime el nombre de usuario");
			nombreUsuario = sc.nextLine();
			System.out.println("Dime la pass");
			password = sc.next();
			sc.nextLine();
			if (nombreUsuario.equals("Aitor") && password.equals("Aitor123")) {
				System.out.println("Correcto");
			} else {
				System.out.println("Nombre o pass incorrecta");
			}
		} while (!nombreUsuario.equals("Aitor") || !password.equals("Aitor123"));

	}

	// metodo para agregar un producto
	public void agregarProducto() {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		while (!salir) {
			Producto nuevoProducto = new Producto();

			System.out.println("Dime el producto que quieres agregar (o escribe 'salir' para terminar):");
			nuevoProducto.setTipoProducto(sc.next());
			if (nuevoProducto.equals("salir")) {
				salir = false; // Salir del bucle si el usuario escribe 'salir'
			}

			System.out.println("Dime el precio:");
			nuevoProducto.setPrecio(sc.nextDouble());

			// Agregar el nuevo producto a la lista
			productos.add(nuevoProducto);

			System.out.println(
					"Producto " + nuevoProducto.getTipoProducto() + " con precio: " + nuevoProducto.getPrecio());
			for (Producto prod : productos) {
				System.out.println(prod);
			}
		}

	}

	// metodo para mostrar los productos
	public void mostrarProducto() {
		for (Producto prod : productos) {
			System.out.println(prod);

		}
	}

}
