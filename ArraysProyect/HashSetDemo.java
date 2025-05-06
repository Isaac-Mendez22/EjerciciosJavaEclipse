import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos = new HashSet<String>();
		System.out.println(autos.add("Volvo"));  //true
		System.out.println(autos.add("BMW"));    //true
		System.out.println(autos.add("VW"));     //true
		System.out.println(autos.add("Ford"));   //true
		System.out.println(autos.add("Audi"));   //true
		System.out.println(autos.add("BMW"));    //false

		System.out.println(autos.size()); //5
		//autos.clear();
		
		System.out.println(autos.isEmpty());//false
		System.out.println(autos.contains("Audi"));
		
		//for (String auto : autos) {
			//System.out.println(auto);
		//}//foreach
		
		HashSet<String> pc = new HashSet<String>();
		
		pc.add("Lenovo"); pc.add("HP");  pc.add("Dell"); 
		pc.add("Toshiba");  pc.add("Gateway");  pc.add("Acer"); 
		pc.add("Asus");  pc.add("Mac");  pc.add("MSI"); 
		
		
		
		autos.forEach((marca)-> mostrarMarcas (marca));
		pc.forEach((marca) -> mostrarMarcas (marca));
	}

	private static Object mostrarMarcas(String marca) {
		System.out.println("+------------------------------------------------------+");
		System.out.println("|   " + marca.toUpperCase());
		System.out.println("+------------------------------------------------------+");
		return null;
	}//main

}//class
