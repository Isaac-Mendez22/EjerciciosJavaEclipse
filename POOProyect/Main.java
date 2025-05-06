import org.generation.classes.person;
import org.generation.classes.Employee;
import org.generation.exceptions.EmailFormatExcetion;

public class Main {

	public static void main(String[] args) {
		//person uriel = new person(); //constructor por default osea que no esta creado en este main pero si en le proyecto pooproyect
		Employee uriel = new Employee("uriel medina", 25, "uriel@yahoo.com",
				"XAXX000000", "su casa", "development", (double) 550);
		Employee sandy = new Employee("sandy de la sancha", 29, "sandy@live.com",
				 "XAXX000000", "su casa", "development", (double) 650);
		
		System.out.println(sandy.getSalary());
		sandy.setRfc("SASN01075C12");
		
		sandy.setAge(15);
		sandy.setName ("sandy de la sancha");
		try {
			sandy.setEmail("sandy@live.com");
			sandy.getSalary();
		} catch (EmailFormatExcetion e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}//catch
		
		
		
		sandy.setRfc("XAXXXX0000");
		sandy.setAddress("su casa");
		
		
		
		
		//uriel.name = "Uriel Medina";
		System.out.println(uriel);
		System.out.println(sandy);
		
		System.out.println(person.getTotal());//2

	}

}
