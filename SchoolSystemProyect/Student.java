
public class Student {

	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    //falto hacer los contructores
    //constructores
    public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//constructor

	public Student(String firstName, String lastName, int registration, int grade) {
		
		 this(firstName, lastName, registration, grade, 2025);
	}
    
	public Student(String firstName, String lastName) {
		
		 this(firstName, lastName, 2025, 1);
	}
	
	
    //Imprimir nombre completo
    public void printFullName(){
    	
    	System.out.println(firstName + " " + lastName); //isaac bien hecho
     }



	//imprimir si esta aprobad(o/a)
     public boolean isApproved(){  //cambiar void a boolean falto isaac
         //TODO implement: should return true if grade >= 60
    	 if(grade >= 60) {
    		 return true; //ibas bien
    	 }
    	 return false; //falto false
     }

     // si aprobo pasa de año
     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congratulations" if the student has been approved
         
    	 if (isApproved()) { //solo isApproved()
    		 year++; //añadir 1 al año
    		 System.out.println("Congratulations you approved");
    		 
    	 }
    	 
    	 return year; //falto
     }
    
    
}//class Student
