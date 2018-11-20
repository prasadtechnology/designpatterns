package observer.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

	List<Observer> observerList = new ArrayList<>();
	boolean isStateChanged = false;
	
	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	public void setStateChanged(boolean stateStatus){
		if(stateStatus){
			notifyObservers();
		}
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observerList){
			observer.execute();
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

}
