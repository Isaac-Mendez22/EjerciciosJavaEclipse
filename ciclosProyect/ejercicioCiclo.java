package ciclosProyect;

public class ejercicioCiclo {

	public static void main(String[] args) {
	for(int col1 = 1; col1 <= 3; col1++) {
		for(int col2 = 1; col2 <= 3; col2++) {
			System.out.println(col1 + " " + col2);
		}//forcont
	}//forotro
			
		//}//for
		System.out.println("================================================");
		for(int col3 = 5; col3 >= 1; col3--) {
			for(int col4 = 1; col4 <= col3; col4++) {
			System.out.println("*");	
			}//for 2
			System.out.println();
		}//for 1
	//}
		System.out.println("================================================");
	}//main

}//class
