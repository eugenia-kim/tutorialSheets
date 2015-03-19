package sheet1;

public class Question1 {

	public static int next(int x) {
		if (x%2 == 0) {
			return x/2;
		} else {
			return 3*x+1;
		}
	}
	
	public static void main(String[] args) {
		int firstInt = Integer.parseInt(args[0]);
		while (firstInt!=1) {
			System.out.println(firstInt);
			firstInt = next(firstInt);
			if (firstInt == 1){
				System.out.println(1);
				break;
			}
		}
		
	}

}
