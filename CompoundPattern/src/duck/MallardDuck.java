package duck;
import observer.Observable;
import interfaces.Observer;
import interfaces.Quackable;

public class MallardDuck implements Quackable {

	private Observable observable;

	public MallardDuck(){
		observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I am MallardDuck quack");
	}

	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck register");
		observable.registerObserver(ob);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

}
