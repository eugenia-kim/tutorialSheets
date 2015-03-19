package sheet2.Question2;

public class NINumber {
	
	private String nationalInsuranceNumber;
	
	public NINumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	
	@Override
	public String toString() {
		return "NI: " + nationalInsuranceNumber;
	}
}
