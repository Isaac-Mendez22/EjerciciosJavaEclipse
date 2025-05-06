package ciclosProyect;

public class whileDemo {

	public static void main(String[] args) {
		int cont;
		
		cont = 5;
		
		while (cont <= 100) {
			if(cont > 90) {
				break;
			}//if
			System.out.println(cont);
			
			cont += 5;
		}//while
		System.out.println("=========================================================================");
			 cont = 100;
			while(cont >= 5) {
				if(cont == 50) {
					cont -= 5;
					continue;
				}//continue
				System.out.println(cont);
				cont-=5;
			}
	}//main

}//class whileDemo
