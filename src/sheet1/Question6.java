package sheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question6 {
	static Character[] v = {'a', 'e', 'i', 'o', 'u'};
	static Set<Character> vowels = new HashSet<Character>(Arrays.asList(v));
	
	static String translateWord(String given) {
		if(given == "") {
			return "";
		} else if(!Character.isDigit(given.charAt(0)) && !(vowels.contains(given.charAt(0))) && given.length() > 1) {
			String temp = given;
			given = given.substring(1,given.length()) + Character.toLowerCase(given.charAt(0)) + "ay";
			if (Character.isUpperCase(temp.charAt(0))) {
				given = Character.toUpperCase(given.charAt(0)) + given.substring(1,given.length());
			}
			return given;
		}
		return given + "way";
	}
	
	public static void main(String[] args) throws IOException {
		String modifiedSentence = "";
		Character[] separators = {'?', '.', ' ', ','};
		Set<Character> c = new HashSet<Character>(Arrays.asList(separators));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String currentWord = "";
		for(int i = 0; i < line.length(); i++) {
			if(c.contains(line.charAt(i))) {
				modifiedSentence += translateWord(currentWord);
				modifiedSentence += line.charAt(i);
				currentWord = "";
			} else {
				currentWord += line.charAt(i);
			}
		}
		modifiedSentence.toLowerCase();
		System.out.print(modifiedSentence);
	}

}
