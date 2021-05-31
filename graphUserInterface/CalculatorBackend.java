package graphUserInterface;

public class CalculatorBackend {
	public static CalculatorReturn returnValues = new CalculatorReturn("", "warte auf Eingabe");
	private static CalculatorReturn returnValues2 = new CalculatorReturn();

	public static double add (double a, double b) {
		return a+b;
	}
	
	public static double subtract (double a, double b) {
		return a-b;
	}
	
	public static double multiply (double a, double b) {
		return a*b;
	}
	
	public static double divide (double a, double b) throws IllegalArgumentException {
		if (b != 0) {
			return a/b;
		}
		else {
			throw new IllegalArgumentException("durch Null geteilt!");
		}
	}

	public static CalculatorReturn command(String actionCommand) {
		
		if (Character.isDigit(actionCommand.charAt(0))) {
			activeAppend(actionCommand.charAt(0));
		} else if (actionCommand.equals(",")) {
			activeSetDecPoint();
		} else if (actionCommand.equals("+") || actionCommand.equals("-") 
				|| actionCommand.equals("/") || actionCommand.equals("*")) {
			setOperation(actionCommand);
		} else if (actionCommand.equals("C")) {
			clearAll();
		} else if (actionCommand.equals("CE")) {
			clearLast();
		} else if (actionCommand.equals("=")) {
			doOperation();
			reset();
			return returnValues2;
		}
		return returnValues;
	}

	private static void doOperation() {
		// TODO Auto-generated method stub
		
	}

	private static void reset() {
		// TODO Auto-generated method stub
		
	}

	private static void clearLast() {
		// TODO Auto-generated method stub
		
	}

	private static void clearAll() {
		// TODO Auto-generated method stub
		
	}

	private static void setOperation(String actionCommand) {
		// TODO Auto-generated method stub
		
	}

	private static void activeSetDecPoint() {
		// TODO Auto-generated method stub
		
	}

	private static void activeAppend(char charAt) {
		// TODO Auto-generated method stub
		
	}
	
	/*
		}else if (actionCommand.equals("+") || actionCommand.equals("-") 
				|| actionCommand.equals("/") || actionCommand.equals("*")) {
			operation = actionCommand.charAt(0);
		} else if (actionCommand.equals("=")) {
			a = Double.parseDouble(aString);
			b = Double.parseDouble(bString);
			switch (operation) {
				case '+': {
					System.out.println("addition");
					break;
				}
				case '-': {
					System.out.println("subtraction");
					break;
				}
				case '/': {
					System.out.println("division");
					break;
				}
				case '*': {
					System.out.println("multiplication");
					break;
				}
			};
	 * 
	 */
}
