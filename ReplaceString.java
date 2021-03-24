package src.classes.informatik1;

/**
 * 
 * @author Lukas Kalvelage
 *
 */
public class ReplaceString {
	public static void main(String[] args) {
		String oldenburg = "Willkommen in Oldenberg!";
		
		String searchFor= "Oldenberg";
		String replaceWith = "Oldenburg";
		
		int firstOccurence = oldenburg.indexOf(searchFor);
		
		
		System.out.println(firstOccurence + "\n");
		
		String betterString = oldenburg.replace(searchFor, replaceWith);
		System.out.println(betterString);
	}
}
