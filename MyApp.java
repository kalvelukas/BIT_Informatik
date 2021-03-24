package src.classes.informatik1;
import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		
		MathUtils myAverage = new MathUtils();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What do you want to do?\nType:\n\n1: for Average\n2: for checksum\n3: for maximum of 2 Integers");
		int decision = scanner.nextInt();
		
		switch (decision) {
		case 1: {
			System.out.println("Average it is!\nPlease type some floating point numbersfor calculation of an average:\nfirst number:");
			double firstScan = scanner.nextDouble();
			System.out.println("second number:");
			double secondScan = scanner.nextDouble();
						
			myAverage.setFirstDb(firstScan);
			myAverage.setSecondDb(secondScan);
			
			System.out.println(myAverage.getReturnAvrg());
			break;
		}
		case 2: {
			System.out.println("Checksum it is!\nPlease type your number:");
			int checkNumber = scanner.nextInt();
			
			scanner.close();
			
			myAverage.setCheckNumber(checkNumber);
						
			System.out.println(myAverage.getRetuChecksum());
			break;
		}
		case 3: {
			System.out.println("third Option");
			int firstInt = scanner.nextInt();
			int secondInt = scanner.nextInt();
						
			System.out.println(myAverage.max(firstInt, secondInt));
			break;
		}
		default:
			scanner.close();
			System.out.println("Error!");
			break;
		}
		
		scanner.close();
	}
}
