import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
    	int longitud = name.length();
    	System.out.println("El length es: " + longitud);
    }

    private static void printNameCharacters( String name )
    {
        
    }

    
}
