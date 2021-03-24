package src.classes.informatik1;

public class Student {
	private String name = "Unbekannt";
	private int studentId;
	private int enrolmentYear = 2020;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getEnrolmentYear() {
		return enrolmentYear;
	}
	
	public void setEnrolmentYear(int enrolmentYear) {
		this.enrolmentYear = enrolmentYear;
	}
}