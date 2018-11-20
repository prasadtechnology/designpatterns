package decorator.design.pattern;

public class Client {

	public static void main(String[] args) {
		
		Beverage beverage = new SoyDecorator(new Coffee());
		System.out.println(beverage.cost());

		Beverage beverage1 = new SoyDecorator(new ExpressoDecarator(new Coffee()));
		System.out.println(beverage1.cost());
		
		
	}

}
