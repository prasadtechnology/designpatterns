package singleton.design.pattern;

/**
 * 1. make private constructor
 * 2. create private and static volatile variable of reference
 * 3. cretae public static method to return object
 * 4. Handle multi threading
 * 5. Double null check
 * @author lav
 *
 */
public class SingletonClass {
	
	private static volatile SingletonClass singletonClass;

	private SingletonClass(){}; 
	
	public static SingletonClass getObject(){
		if(singletonClass == null){
			synchronized (SingletonClass.class) {
				if(singletonClass == null){
					singletonClass = new SingletonClass();
				}
			}
		}
		return singletonClass;
	}
}
