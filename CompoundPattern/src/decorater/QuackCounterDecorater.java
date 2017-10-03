package decorater;
import interfaces.Observer;
import interfaces.Quackable;

// 装饰者模式，同时又实现了被观察者（主题对象）
public class QuackCounterDecorater implements Quackable{

	private Quackable quackable;
	public static int numberOfQuacks=0;

	public void quack() {
		// TODO Auto-generated method stub
		quackable.quack();
		numberOfQuacks ++;
	}

	public QuackCounterDecorater( Quackable quackable){
		this.quackable = quackable;

	}

	public static int getQuacks(){
		return numberOfQuacks;
	}

	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		quackable.registerObserver(ob);

	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		quackable.notifyObservers();
	}

}
