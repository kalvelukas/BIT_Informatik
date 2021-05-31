package inputOutput;

import java.io.File;
import java.io.IOException;

public class inStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("datendemoIO.txt");
		boolean isExisting = file.exists();
		
		if (!isExisting) {
			System.out.println("Datei erzeugen...");
			isExisting = file.createNewFile();
			System.out.println("Datei erzeugt.");
		}
		
		if (isExisting && file.isFile()) {
			System.out.println("Datei auslesbar: " + file.canRead());
			System.out.println("Datei schreibbar: " + file.canWrite());
			file.delete();
		}
	}
}
