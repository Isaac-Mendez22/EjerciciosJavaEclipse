package controlFlujoProyect;
import java.util.Scanner;

public class calculadoraComision {

	public static void main(String[] args) {
		System.out.println("cuanto vendiste hoy?");
		Scanner in = new Scanner (System.in);
		int ingresoVenta = in.nextInt();
		int valorTotal = (ingresoVenta * 30/100);
		
		if(ingresoVenta >= 10_000){
			System.out.println("Aplica comisión del 30% equivalente a: " + valorTotal);
		}else if(ingresoVenta>= (9_999 - 5_001)) {
			System.out.println("Aplica comisión del 20% equivalente a: " + valorTotal);
		}else if(ingresoVenta >= (5000 - 1000)) {
			System.out.println("Aplica comisión del 10% equivalente a: " + valorTotal);
		}else {
			System.out.println("no aplica comisión");
		}
		
		in.close();
	}

}
