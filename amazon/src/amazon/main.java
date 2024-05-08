package amazon;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menuTipoUsuario();
	}

	// creamos un metodo que de a elegir si usuario o vendedor
	public static void menuTipoUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eligue una opcion \n 1-Vendedor \n 2-Comprador");
		int opcion = sc.nextInt();
//usa un switch para el menu 
		switch (opcion) {
		case 1: {
			Vendedor v1 = new Vendedor();
			v1.acceso();

			v1.menuVendedor();
			break;
		}
		case 2: {
			break;
		}
		default:

		}
	}
}
