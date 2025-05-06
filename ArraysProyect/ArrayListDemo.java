import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(35);
		numeros.add(33);
		numeros.add(42);
		numeros.add(10);
		numeros.add(14);
		numeros.add(19);
		numeros.add(27);
		numeros.add(44);
		numeros.add(26);
		numeros.add(31);
		numeros.add(33);
		
		System.out.println(numeros.size()); //10
		System.out.println(numeros.get(0)); //35
		System.out.println(numeros.get(5)); //19
		//podria dar true la sig. sysout? si hya varias formas
		
		//creando un nuevo array
		//ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//poniendo un clear
		//numeros.clear();
		System.out.println(numeros.isEmpty()); //esta vacio? //false
		
		System.out.println(numeros.indexOf(33)); //regresa un 1 por qu es el indice
		
		System.out.println(numeros.lastIndexOf(33));// regresa el ultimo indice //10
		
		
		//for (Integer  integer : numeros) {
			//System.out.println(integer);
		//}
		
		//Real foreach
		numeros.forEach((num)-> imprimirParesImpares(num));
		
	}//main
	
	//funcion creada por eclipse ante un metodo inexsistente
	private static void imprimirParesImpares(Integer num) {
		if ((num % 2) == 0 ) {
			System.out.println(num + " es par");
		} else {
			System.out.println(num + " es impar");
		}
	}

}//class
