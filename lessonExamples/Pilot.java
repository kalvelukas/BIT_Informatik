package lessonExamples;

public class Pilot extends Person {
	public double hoursFlown;
	
	public Pilot(String surname, String lastName, double hoursFlown) {
		super(surname, lastName);
		setHoursFlown(hoursFlown);
	}

	public double getHoursFlown() {
		return hoursFlown;
	}

	public void setHoursFlown(double hoursFlown) {
		this.hoursFlown = hoursFlown;
	}
}
