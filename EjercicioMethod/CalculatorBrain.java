import java.util.Scanner;

import methodsProject.methodDemo;

public class CalculatorBrain {

	public static void main(String[] args) {
		Scanner console = new Scanner( System.in );
		console.close();
		System.out.println(CalculatorBrain.multiplicacion(7, 7, 3, 5, 8));
		System.out.println(CalculatorBrain.suma(7, 7, 9, 8));
		System.out.println(CalculatorBrain.resta(7, 7, 10));
		System.out.println(CalculatorBrain.division(7, 7));
	}
		
		
	    public static int suma (int num1, int num2, int num3, int num4) {
	    	int num5 = num1 + num2 + num3 + num4;
	    			return num5;
	    }
	    public static int resta (int num1, int num2, int num3) {
	    	int num4 = num3 - num2 - num3;
	    		return num4;
	    }
	    public static int multiplicacion(int num1, int num2, int num3, int num4, int num5) {
	    	int num6 = num1 * num2 * num3 * num4 * num5;
	    		return num6;
	    }
	    public static int division(int num1, int num2) {
	    	int num3 = num1 / num2;
	    		return num3;
	    	
	}
}
