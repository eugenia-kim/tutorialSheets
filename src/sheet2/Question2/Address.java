package sheet2.Question2;

public class Address {
	
	private int houseNumber;
	private String address1;
	private String address2;
	private String postCode;

	public Address(int houseNumber, String address1, String address2, String postCode) {
		this.houseNumber = houseNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.postCode = postCode;
	}
	
	@Override
	public boolean equals(Object that) {
		if(!(that instanceof Address)) {
			return false;
		} else {
			Address thatAddress = (Address) that;
			return houseNumber == thatAddress.houseNumber && address1.equals(thatAddress.address1) &&
					address2.equals(thatAddress.address2) &&
					postCode.equals(thatAddress.postCode);
		}
	}
	
	@Override
	public int hashCode() {
		return 17*houseNumber ^ address1.hashCode() ^ address2.hashCode() ^ postCode.hashCode();
	}
	
	@Override
	public String toString() {
		return "Address: " + houseNumber + " " + address1 + ", " + address2 + ", " + postCode;
	}
	
}
