package controlFlujoProyect;

import java.util.Scanner;

public class switchDemo2 {
	public static void main(String[] args) {
		System.out.println("escribe el número del mes: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		//este se implementa a partir de java 14
		//solo funciona cuando la variable aplica a todos los casos como en este caso en switch demo con (monthString)
		String monthString = switch (month) {
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "Mes Incorrecto";
		};
		System.out.println("mes seleccionado" + monthString);
		in.close();
	}
	

}
