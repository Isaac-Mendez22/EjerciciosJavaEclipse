import java.util.ArrayList;

public class Course {
	
    String courseName;
    String professorName;
    int year;
    
    ArrayList<Student> students;
    public Course ( String courseName, String professorName, int year ){
    	super();
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        students = new ArrayList<Student>();
    }//constructor
    
    public void enroll(Student student){
    	if(student !=null) {
    	students.add(student);
    	}//!=null
     }//enroll
    
    public void enroll(Student[] students) {
    	for (Student student : students) {
			this.enroll(student);
		}//foreach
    }//enroll

     public void unEnroll(Student student){
    	 
    	 if (students.contains(student)) {
    		 students.remove(student);
    	 }//contains
     }//unEnroll

     public int countStudents(){
         return students.size();
     }
     
     public int bestGrade(){
    	 int max=0;
         for (Student student : students) {
			if (student.grade>max) {
				max = student.grade;
			}
		}
         return 0;
     }
    
    
    
}//class Course
