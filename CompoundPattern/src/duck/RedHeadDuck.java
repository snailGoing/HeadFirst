package duck;
import observer.Observable;
import interfaces.Observer;
import interfaces.Quackable;


public class RedHeadDuck implements Quackable {


	private Observable observable;

	public RedHeadDuck(){
		observable = new Observable(this);
	}

	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I am RedHeadDuck quack");
	}

	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		System.out.println("RedHeadDuck register");
		observable.registerObserver(ob);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

}
