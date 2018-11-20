package observer.design.pattern;

public class Client {

	public static void main(String[] args) {
		Observer observer1 = new Observer1();
		Observer observer2 = new Observer2();
		
		Publisher publisher = new Publisher();
		publisher.registerObserver(observer1);
		publisher.registerObserver(observer2);
		
		publisher.setStateChanged(true);
		
		System.out.println(" ========================= ");
		
		publisher.removeObserver(observer1);
		publisher.setStateChanged(true);
		
	}

}
