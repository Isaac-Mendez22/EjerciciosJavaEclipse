import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> colores = new HashMap<String, String>();
		colores.put("ROJO", "#FF0000");
		colores.put("VERDE", "#00FF00");
		colores.put("AZUL", "#0000FF");
		colores.put("BLANCO", "#FFFFFF");
		colores.put("NEGRO", "#000000");
		colores.put("CYAN", "#00FFFF");
		colores.put("AMARILLO", "#FFFF00");
		colores.put("FUCHSIA", "#FF00FF");
		System.out.println( colores.put("NAVY", "#000080"));//NULL
		System.out.println( colores.put("NAVY", "#000088"));//000080
		
		System.out.println(colores.size());
		System.out.println(colores.get("AMARILLO"));
		
		//for (String Key : colores.keySet()) {
			//System.out.println(Key + "->" + colores.get(Key));
		//}
			//for (String Value : colores.values()) {
				//System.out.println(Value);
		//}
			
			colores.forEach((k,v) -> mostrar(k,v));
		
	}//main

	private static void mostrar(String k, String v) {
		System.out.println("+------------------------------------------------------+");
		System.out.println("|   " + k + "->"+ v);
		System.out.println("+------------------------------------------------------+");
	}

}// class HashMapDemo
