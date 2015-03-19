package sheet2.Question6;

public class TwoTieredComparator implements PersonComparator{
	
	PersonComparator first;
	PersonComparator second;

	public TwoTieredComparator(PersonComparator first, PersonComparator second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public int compareTo(Person person1, Person person2) {
		if(first.compareTo(person1, person2) != 0) {
			return first.compareTo(person1, person2);
		} else {
			return second.compareTo(person1, person2);
		}
	}

}
