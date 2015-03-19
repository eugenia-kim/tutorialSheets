package sheet1;

public class Question2 {
	
	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		} else {
			return s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1, s.length() - 1));
		}
	}
	
	public static void main(String[] args) {
		for (int i=0; i<2000; i++) {
			String cube = String.valueOf(i*i*i);
			if (isPalindrome(cube)) {
				System.out.println(i +" cubed is "+ cube);
			}
		}
	}

}
