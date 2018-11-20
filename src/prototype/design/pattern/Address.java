package prototype.design.pattern;

public class Address {

	private String addressLine1;
	private String city;
	private String state;
	private int pinCode;
	
	public Address(String addressLine1, String city, String state, int pinCode) {
		super();
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ "]";
	}
	
	
}
