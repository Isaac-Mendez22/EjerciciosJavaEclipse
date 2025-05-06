
public class MatrizDemo {

	public static void main(String[] args) {
		int matriz[][]= {
				{1, 2, 3, 4, 5},  //0
				{6, 7, 8, 9, 10}, //1
				{11, 12, 13, 14}  //2
		};
		System.out.println(
					matriz[1][3]
				);
		
		//for
		for (int ren = 0; ren < matriz.length; ren++) {
			
			for (int col = 0; col < matriz[ren].length; col++) {
				
				
				System.out.print(matriz [ren][col] + ", ");
			}//for col
			System.out.println();
		}//for ren
	}//main

}//class MatrizDemo
