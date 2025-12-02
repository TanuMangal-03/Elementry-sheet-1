import java.util.*;
public class largestsmallestword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);;
		String str = input.nextLine().trim();  //"  Hello World   "  trim() = = "Hello World"
		
		String[] words = str.split("\\s+"); 

	    String smallest = words[0];
	    String largest = words[0];
	    for (String word : words) {
	       if (word.length() < smallest.length()) {
	    	   smallest = word;
	       }
	       if (word.length() > largest.length()) {
	           largest = word;
	       }
	    }

	    System.out.println("Smallest word: " + smallest);
	    System.out.println("Largest word: " + largest);
	    }
		
	}