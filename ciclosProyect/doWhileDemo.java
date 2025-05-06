package ciclosProyect;

public class doWhileDemo {

	public static void main(String[] args) {
		int cont;
		cont = 5;
		do {
			System.out.println(cont);
			cont+=5;
		}while(cont<=100);// do-while
		System.out.println("==================================================================");
		cont = 100;
		do {
			System.out.println(cont);
			cont -= 5;
		}while(cont >= 5);
	}//main

}//class doWhileDemo
