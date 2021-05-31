package handleExceptions;

public class MonthDemo {

	public static void main(String[] args) {
		try {
			Month april = new Month(10);
			System.out.println(april);
		} catch (InvalidMonthException e) {
			System.out.println("InvalidMonthException: " + e.getMessage());
		}
		
		System.out.println(Month.toString(8));
	}
}
