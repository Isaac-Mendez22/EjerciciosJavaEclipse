package controlFlujoProyect;
import java.util.Scanner;

public class descuentoPelicula {

	public static void main(String[] args) {
		System.out.println("cual es tu edad para saber si aplica algun descuento a tu boleto de cine?");
		Scanner in = new Scanner (System.in);
		int ingresoEdad = in.nextInt();
		double ticket = 7;
		double descuentoAdulto = (ticket * 0.40);
		double descuentoNiño = (ticket * 0.45);
		
		if(ingresoEdad <= 5) {
			System.out.println("tienes descuento del 60% por lo que el costo es: €" + descuentoNiño);
		}else if (ingresoEdad >= 60) {
			System.out.println("tienes descuento del 55% por lo que el costo es: €" + descuentoAdulto);
		}else {
			System.out.println("No aplica descuento pagas el boleto completo de: €" + ticket);
		}
		
		
		in.close();
	}

}
