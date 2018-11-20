package prototype.design.pattern;

public class Client {

	public static void main(String[] args) {
		
		Address address = new Address("addresline1","city1","state1",12345);
		User user = new User("first name", "lastname", "email",address);
		
		try {
			User uClone = user.clone();
			uClone.setFirstName("testing");
			uClone.getAddress().setCity("guntur");
			
			System.out.println(" original : "+user);
			System.out.println(" clone : "+uClone);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
