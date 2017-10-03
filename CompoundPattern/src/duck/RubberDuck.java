package duck;
import observer.Observable;
import interfaces.Observer;
import interfaces.Quackable;


public class RubberDuck implements Quackable {

	private Observable observable;
	public RubberDuck(){
		observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I am RubberDuck quack");
	}

	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck register");
		observable.registerObserver(ob);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

}
