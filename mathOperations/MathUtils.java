package mathOperations;

public class MathUtils {
	private double firstDb;
	private double secondDb;
	private int checkNumber;
	double retuAvrg;
	int retuChecksum;
	
	
	public void setFirstDb(double firstDb) {
		this.firstDb = firstDb;
	}
	
	public void setSecondDb(double secondDb) {
		this.secondDb = secondDb;
	}
		
	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	public int getRetuChecksum() {
		return retuChecksum = calcChecksum(checkNumber);
	}
	
	public double getReturnAvrg() {
		return retuAvrg = calcAverage(firstDb, secondDb);
	}
	
	private double calcAverage(double firstDb, double secondDb) {
		double retuAvrg = (( firstDb + secondDb ) / 2);
		return retuAvrg;
	}
	
	private int calcChecksum(int checkNumber) {
		while (checkNumber > 0) {
			retuChecksum = retuChecksum + (checkNumber % 10);
			checkNumber = checkNumber / 10;
		}
		return retuChecksum;
	}
	
	int max (int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	double max (double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	int max (int a, int b, int c) {
		return max(max(a, b), c);
	}
}