package src.classes.informatik1;

public class ValueRangeFloat {

	public static void main(String[] args) {
		//declare variables int and float
		float f = 0;
		int   in = 0;
		//aidVar type double for exact comparison
		double fAid = 0;
		double iAid = 0;
		//while comparison through aidVar
		while (fAid == iAid) {
			f++;
			in++;
			fAid = f;
			iAid = in;
		}
		System.out.println(in);
	}
}