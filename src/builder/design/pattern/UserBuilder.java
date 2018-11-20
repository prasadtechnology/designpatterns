package builder.design.pattern;

public class UserBuilder {

	private String firstName;
	private String lastName;
	private String emailId;
	private User user;
	
	public UserBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public UserBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public UserBuilder setEmailId(String emailId) {
		this.emailId = emailId;
		return this;
	}
	
	public User build(){
		return new User(firstName,lastName,emailId);
	}
	
}
