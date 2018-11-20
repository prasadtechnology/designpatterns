package builder.design.pattern;

public class Client {

	public static void main(String[] args) {

		User user = new UserBuilder()
					.setFirstName("vikranth")
					.setLastName("pulipati")
					.setEmailId("prasad@lrnfast.com")
					.build();
		
		System.out.println(user);

	}

}
