package lessonExamples;

public class Person {
	private String surname, lastName;
	
	public Person(String surname, String lastName) {
		this.surname = surname;
		this.lastName = lastName;
	}
	public String getSurname() {
		return surname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return surname +" " + lastName;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return surname + " " + lastName;
	}
}
