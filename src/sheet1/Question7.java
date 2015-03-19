package sheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question7 {
	static int linesNo = 0;
	static int wordsNo = 0;
	static int charactersNo = 0;
	
	public static void main(String[] args) throws IOException {
		Character[] nonCharacters = {' ','"','.',',',',','?','!'};
		Character[] separaters = {' '};
		Set<Character> sp = new HashSet<Character>(Arrays.asList(separaters));
		Set<Character> nc = new HashSet<Character>(Arrays.asList(nonCharacters));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		while(line != null) {
			wordsNo++;
			for(int i = 0; i < line.length(); i++) {
				if(!(nc.contains(line.charAt(i)))) {
					charactersNo++;
				}
				if(sp.contains(line.charAt(i))) {
					wordsNo++;
				}
			}
			linesNo++;
			line = br.readLine();
		}
		System.out.println("Lines: " + linesNo);
		System.out.println("Words: " + wordsNo);
		System.out.println("Characters: " + charactersNo);
	}

}
