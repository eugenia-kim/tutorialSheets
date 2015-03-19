package sheet2.Question6;

public class FornameComparator implements PersonComparator {

	@Override
	public int compareTo(Person person1, Person person2) {
		String forname1 = person1.getForname();
		String forname2 = person2.getForname();
		for(int i = 0; i < Math.min(forname1.length(), forname2.length()); i++) {
			if(forname1.charAt(i) > forname2.charAt(i)) {
				return 1;
			} else if(forname1.charAt(i) < forname2.charAt(i)) {
				return -1;
			}
		}
		return 0;
	}

}
