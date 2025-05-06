package controlFlujoProyect;

import java.util.Scanner;

public class switchDemo3 {

	public static void main(String[] args) {
		System.out.println("escribe el número del mes: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
//hecho por mi a como lo entendi.
//		Number dayNumber;
//		switch (month) {
//	case 1: dayNumber = 31;
//		break;
//	case 2: dayNumber = 28;
//		break;
//	case 3: dayNumber = 31;
//		break;
//	case 4: dayNumber = 30;
//		break;
//	case 5: dayNumber = 31;
//		break;
//	case 6: dayNumber = 30;
//		break;
//	case 7: dayNumber = 31;
//		break;
//	case 8: dayNumber= 31;
//		break;
//	case 9: dayNumber = 30;
//		break;
//	case 10: dayNumber = 31;
//		break;
//	case 11: dayNumber = 30;
//		break;
//	case 12: dayNumber = 31;
//		break;
//	default:
//		dayNumber = 0;
//		break;
//		}//switch
//		
//		
//		
//		System.out.println("numero de días del mes seleccionado: " + dayNumber);
		
		
		//forma de hacerlo como jc: agrupando casos.
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28/29");
			break;
		default:
			System.out.println("No es un mes valido");
			break;
		}//switch
		
		in.close();

	}

}
