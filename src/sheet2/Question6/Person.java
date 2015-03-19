package sheet2.Question6;

public class Person {
	
	private String surname;
	private String forname;
	private String number;
	
	public Person(String surname, String forname, String number) {
		this.surname = surname;
		this.forname = forname;
		this.number = number;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getForname() {
		return forname;
	}
	
	public String getNumber() {
		return number;
	}
	
	@Override
	public String toString() { 
		return forname + " " + surname + ": " + number;
	}
}

