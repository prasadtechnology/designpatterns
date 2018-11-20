package decorator.design.pattern;

public class ExpressoDecarator extends BeverageDecorator{

	Beverage beverage;
	int expressoCost = 3;
	
	public ExpressoDecarator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	int cost() {	
		return this.beverage.cost()+expressoCost;
	}
	
}
