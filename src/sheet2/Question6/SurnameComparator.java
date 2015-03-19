package sheet2.Question6;

public class SurnameComparator implements PersonComparator {

	@Override
	public int compareTo(Person person1, Person person2) {
		String surname1 = person1.getSurname();
		String surname2 = person2.getSurname();
		for(int i = 0; i < Math.min(surname1.length(), surname2.length()); i++) {
			if(surname1.charAt(i) > surname2.charAt(i)) {
				return 1;
			} else if(surname1.charAt(i) < surname2.charAt(i)) {
				return -1;
			}
		}
		return 0;
		/*if(surname1.length() > surname2.length()) {
			return -1;
		} else if(surname1.length() < surname2.length()) {
			return 1;
		} else {
			return 0;
		}*/
	}
	
}
