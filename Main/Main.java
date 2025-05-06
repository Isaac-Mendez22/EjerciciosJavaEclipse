import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Escribe el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		
		int res = 0;
		int [] arreglo = {1};
		
		try {
			 res = num1/num2;
		}catch(ArithmeticException ae){ //no se supo hasta que se ejecuto el programa y la probamos con distinto numeros
			if (ae.getMessage().equals("/ by zero")) {
			System.out.println("no se puede dividir entre cero, "
					+ "te mostramos entre 1");
			num2=1;
			res = num1/num2;
			}//if / by zero
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("no se puede establecer el resultado en el arreglo");
			arreglo [0] = res;
		}//catch
		
		res = num1/num2;
		System.out.println("Tu resultado es: " + (res));
		sc.close();
	}

}
