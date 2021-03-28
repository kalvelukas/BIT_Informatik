package mathOperations;

public class CalcAvrg {
	private double first;
	private double second;
	double retuAvrg;
		
	public void setFirst(double first) {
		this.first = first;
	}
	
	public void setSecond(double second) {
		this.second = second;
	}
	
	private double calcAverage(double first, double second) {
		double retuAvrg = (( first + second ) / 2);
		return retuAvrg;
	}
	
	public double getReturnAvrg() {
		return retuAvrg = calcAverage(first, second);
	}
}