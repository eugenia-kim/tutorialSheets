package sheet2.Question6;

public class NumberComparator implements PersonComparator {

	@Override
	public int compareTo(Person person1, Person person2) {
		String number1 = person1.getNumber();
		String number2 = person2.getNumber();
		for(int i = 0; i < number1.length(); i++) {
			if(number1.charAt(i) > number1.charAt(i)) {
				return 1;
			} else if(number1.charAt(i) < number2.charAt(i)) {
				return -1;
			}
		}
		return 0;
	}

}
