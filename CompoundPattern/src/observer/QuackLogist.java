package observer;
import interfaces.Observer;
import interfaces.QuackObservable;


public class QuackLogist implements Observer {

	public void update(QuackObservable quackable) {
		// TODO Auto-generated method stub
		System.out.println("QuackLogistObserver: update()--> "+ quackable +"  just quacked!");
	}

}
