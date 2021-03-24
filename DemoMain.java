package informatik2;

//Class
public class DemoMain {
	
	//Constants
	private static final int LOOPS = 5;
	
	//Data Fields
	private DemoClass simpleProgramClass;
	
	//Constructors
	public DemoMain() {
		simpleProgramClass = new DemoClass(LOOPS);
	}
	
	public void run() {
		simpleProgramClass.startProgram();
	}
	
	public static void main(String[] args) {
		var mainExec = new DemoMain();
		
		mainExec.run();
	}

}
