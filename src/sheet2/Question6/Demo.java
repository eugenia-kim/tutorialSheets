package sheet2.Question6;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo {
	
	public static List<Person> findMinimal(Set<Person> people, PersonComparator comparator) {
		
		List<Person> result = new ArrayList<Person>();
		
		for(Person p : people) {
			if(result.isEmpty()) {
				result.add(p);
				continue;
			}
			if(comparator.compareTo(p, result.get(0)) == 0) {
				result.add(p);
			} else if(comparator.compareTo(p, result.get(0)) < 0) {
				result.clear();
				result.add(p);
			}
		}
		return result;
	}
	
	public static Person findMin(Set<Person> people, PersonComparator comparator) {
		Person minimumPerson = null;
		for(Person p : people) {
			if(minimumPerson == null || comparator.compareTo(p, minimumPerson) < 0) {
				minimumPerson = p;
			}
		}
		return minimumPerson;
	}

	public static void main(String[] args) {
		
		Person person1 = new Person("Eugenia", "Kim", "07517004450");
		Person person2 = new Person("Eugene", "Kim", "07960434321");
		SurnameComparator surnameCom = new SurnameComparator();
		int a = surnameCom.compareTo(person1, person2);
		System.out.println(a);
	}

}
