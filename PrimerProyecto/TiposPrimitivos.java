
public class TiposPrimitivos {

	public static void main(String[] args) {
		//Enteros
		byte dia = 1, mes, otro = 3;
		byte num1=10, num2=3, num3=3;
		byte edad = 120;
		short year = 2025;
		int id = 214587;
		//ASCII
		//American Standard Code for Information Interchange
		
		//conversion implicita
		//year = edad; //se hace sola la conversion ya que pasa de un contenedor mas chico a uno mas grande
		//conversion explicita
		//edad = (byte)year; //se añade el tipo de dato para hacer la conversion de undato mas grande a una mas pequeña
		long numeroT = 1_245_789_546_503L; //si salimos fuera del rango de los enteros podemos poner un L para que lo detecte como un numero entero
		// separador de miles "_"
		
		//números con punto decimal
		float PI = 3.141615962F; //se pone la F para hacer una converción de double a float
		float num4=10, num5=3;
		double otroPI = 3.141615692;
		
		//otros tipos de dato
		
		char letra = 'A' ;
		boolean isvalid = true; //true; //false; //siempre en minusculas
		
		System.out.println((num4/num5));
		System.out.println((num1/num2));
		System.out.println(edad);
		System.out.println(year);
		System.out.println(id);
		System.out.println(numeroT);
	}
	
}//class
