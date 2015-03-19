package sheet2.Question2;

import java.util.StringTokenizer;

public class Person {

	private String forenames;
	private String surname;
	private Date date;
	private Address address;
	private NINumber ninumber;
	

	public Person(String forename, String surname, Date date,
			NINumber ninumber,
			Address address) {
		this.forenames = forename;
		this.surname = surname;
		this.date = date;
		this.ninumber = ninumber;
		this.address = address;
	}

	public boolean sameAddress(Person other) {
		return address.equals(other.address);
	}

	public String getInitials() {
		String result = "";
		StringTokenizer strTok = new StringTokenizer(forenames);
		while(strTok.hasMoreTokens()) {
			result += strTok.nextToken().charAt(0);
		}
		return result + surname.charAt(0);
	}


	public String toString() {
		return "Name: " + forenames + " " + surname + "\n"
		+ date + "\n"
		+  address + "\n"
		+ ninumber;
		
	}
	
}