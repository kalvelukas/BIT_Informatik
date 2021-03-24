package src.classes.informatik1;

public class StudentDemo {

	public static void main(String[] args) {
			String lena = new String ("Lena");
			String otherRef = lena;
			lena += " B.";
			System.out.println(lena == otherRef);
			System.out.println("lena = " + lena);
			System.out.println("otherRef = " + otherRef);
		}
}