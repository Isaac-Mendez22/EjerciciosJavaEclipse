package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee extends person {
private String department;
private Double salary;

public Employee(String name, int age, String email, String rfc, String address, 
				String department, Double salary) {

	super(name, age, email, rfc, address);
	this.department = department;
	this.salary = salary;
}


public String getDepartment() {
	return department;
}




public void setDepartment(String department) {
	this.department = department;
}




public Double getSalary() {
	return salary;
}




public void setSalary(Double salary) {
	this.salary = salary;
}

public void setRfc (String rfc) {
	Pattern p = Pattern.compile("^[A-ZÑ]{4}[0-9]{6}[A-Z0-9]{3}$");
	Matcher m = p.matcher(rfc);
	if(m.matches()) {
		super.setRfc(rfc);
	}else {
		super.setRfc("XAXX000000");
	}//else
}//setrfc

//public int getId() {
	//return id;
//}//getId


@Override
public String toString() {
	return "Employee [department=" + department + ", salary=" + salary + ", getDepartment()=" + getDepartment()
			+ ", getSalary()=" + getSalary() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getEmail()="
			+ getEmail() + ", getRfc()=" + getRfc() + ", getAddress()=" + getAddress() + ", toString()="
			+ "]";
}


}//class employee
