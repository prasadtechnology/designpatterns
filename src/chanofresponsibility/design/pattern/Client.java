package chanofresponsibility.design.pattern;

public class Client {

	public static void main(String[] args) {
		
		ChainObjects c1 = new ChainObject1();
		ChainObject2 c2 = new ChainObject2();
		ChainObject3 c3 = new ChainObject3();

		c1.setChainObject(c2);
		c2.setChainObject(c3);
		
		c1.printText(0);
		c1.printText(1);
		c1.printText(2);
		c1.printText(3);
		
	}

}
