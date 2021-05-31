package graphUserInterface;

public class CalculatorReturn {
	private String displayString;
	private String notifyString;

	CalculatorReturn () {
		displayString = new String();
		notifyString = new String();
	}
	CalculatorReturn (String displayString, String notifyString) {
		this.displayString = displayString;
		this.notifyString = notifyString;
	}
	
	public String getDisplayString() {
		return displayString;
	}
	
	public String getNotifyString() {
		return notifyString;
	}
	
	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}
	
	public void setNotifyString(String notifyString) {
		this.notifyString = notifyString;
	}
}
