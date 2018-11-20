package decorator.design.pattern;

public class SoyDecorator extends BeverageDecorator{

	Beverage beverage;
	int soyCost = 2;
	
	public SoyDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	int cost() {
		return this.beverage.cost()+soyCost;
	}

}
