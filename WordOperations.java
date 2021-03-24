/**
 * 
 */
package src.classes.informatik1;

/**
 * @author Lukas Kalvelage
 *
 */
public class WordOperations {

	public String word;
	static char[] vowelChars = new char[] {'a', 'e', 'i', 'o', 'u', 'ü', 'ö', 'ä'};
	
	public static void checkVowels(String inputString) {
		int vowelCount = 0;
		int consonantCount = 0;
		
		inputString = inputString.toLowerCase();
		for (int i = 0; i < inputString.length(); i++) {
			
			
		}
	}

	public static String getPhrase(String original, String start, String end) {
		return original.substring(original.indexOf(start),
				(original.lastIndexOf(end) + end.length()));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getPhrase("Wir gehen heute wunderbar toll einkaufen.", "wu", "ar"));
	}
}
