package sheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question5 {
	static Stack<String> stack = new Stack<String>();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in)
		);
		String line = br.readLine();
		while(line != null) {
		stack.push(line);
		line = br.readLine();
		}
		while(!(stack.isEmpty())) {
			System.out.println(stack.pop());
		}
	}

}
