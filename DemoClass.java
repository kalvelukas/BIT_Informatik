package informatik2;

public class DemoClass {

	int loops;
	
	public DemoClass(int loopings) {
		loops = loopings;
	}

	public void startProgram() {
		printStart();
		loopSomeTimes();
		printEnd();
		loopSomeTimes();
		printStart();
		loopSomeTimes();
		printEnd();
	}

	private void printEnd() {
		System.out.println("end of program");
	}

	private void loopSomeTimes() {
		for (int i = 0; i < loops; i++) {
			System.out.printf("This is the loop with index %d\n",i);
		}
	}

	private void printStart() {
		System.out.println("start program");
	}

}
