package factory.design.pattern;

public class Client {

	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.getAnimal("dog");
		animal.name();

		System.out.println(" =================== ");
		
		Animal animal2 = AnimalFactory.getAnimal("cat");
		animal2.name();
		
		System.out.println(" ================ ");
		
		Animal animal3 = AnimalFactory.getAnimal("lion");
		animal3.name();
	}

}
