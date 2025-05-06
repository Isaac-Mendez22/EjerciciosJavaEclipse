package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.exceptions.EmailFormatExcetion;

public class person {

	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	
	private static int total = 0;

	
public person(String name, int age, String email, String rfc, String address) {
	this.name=name.toUpperCase(); 
	this.age=(age<18)?18:age; 
	this.email=email.toLowerCase(); 
	this.rfc=rfc.toUpperCase(); 
	this.address=address;
	person.total++;
	id=person.total;
}//constructor // ahora que creamos un constructor aqui en main.java ya no podemos usar el constructor por default	
public person(String name, String email, String address) {
	this (name, 0, email, "XAXX000000", address);
}//constructor

public person(String name, String email) {
		this (name, email, "domicilio conocido");
	}//constructor


//geters
public String getName() {
	return name;
}//get name

public int getAge() {
	return age;
}//get age

public String getEmail() {
	return email;
}//get email

public String getRfc() {
	return rfc;
}//get rfc

public String getAddress() {
	return address;
}//get address


//seters
public void setName(String name) {
	this.name = name;
}

public void setAge(int age) {
	this.age = (age < 18)? 18 : age;
}//set age



public int getId() {
	return id;
}
public static int getTotal() {
	return person.total;
}
public void setEmail(String email) throws EmailFormatExcetion {
	Pattern regex = Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
	Matcher m = regex.matcher(email);
	if(m.matches()) {
		this.email = email;
	}else {
		this.email = "sincorreo@dominio.com";
				throw new EmailFormatExcetion("el correo [" + email
						+ "necesita un formato valido");
	}//else
	this.email = email;
} //setemail

public void setRfc(String rfc) {
	this.rfc = rfc;
}

public void setAddress(String address) {
	this.address = address;
}


	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ "]";
	}

}//class person
