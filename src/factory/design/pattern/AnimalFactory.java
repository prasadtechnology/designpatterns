package factory.design.pattern;

public class AnimalFactory {
	
	public static Animal getAnimal(String name){
		
		Animal animal;
		
		if(name.equals("dog")){
			animal =  new Dog();
		}else if(name.equals("cat")){
			animal = new Cat(); 
		}else{
			System.out.println(" no animal found");
			throw new RuntimeException(" No animal found with this name : "+name);
		}
	
		return animal;
	
	}
}
