package src.classes.informatik1;

import banking.Person;

public class Pilot extends Person {
	double hoursFlown;
	
	public Pilot(String name, double hoursFlown) {
		super(name);
		setHoursFlown(hoursFlown);
	}

	public double getHoursFlown() {
		return hoursFlown;
	}

	public void setHoursFlown(double hoursFlown) {
		this.hoursFlown = hoursFlown;
	}
}
