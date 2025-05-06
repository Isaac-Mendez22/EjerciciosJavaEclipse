package methodsProject;

public class methodDemo {

	public static void main(String[] args) {
		methodDemo op = new methodDemo();
		System.out.println(op.suma(30, 40));
		
		System.out.println(methodDemo.multiplica(7, 7));

	}//main
	
	public int suma (int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}//suma
	
	public static int multiplica(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}//multiplica

}//class
