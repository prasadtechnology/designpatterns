package observer.design.pattern;

public interface Subject {

	void registerObserver(Observer observer);
	void notifyObservers();
	void removeObserver(Observer observer);
}
