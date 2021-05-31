package handleExceptions;

public class Month {
	private int monthIndex;

	public Month(int monthID) throws InvalidMonthException {
		super();
		if (monthID < 0 || monthID >= 12) {
			throw new InvalidMonthException(monthID);
		}
		this.monthIndex = monthID;
	}

	@Override
	public String toString() {
		return Month.toString(monthIndex);
	}

	public static String toString(int monthIndex) {
		String[] months = {"Januar", "Februar", "M‰rz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		return months[monthIndex];
	}
}
