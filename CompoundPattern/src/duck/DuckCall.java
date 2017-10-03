package duck;
import observer.Observable;
import interfaces.Observer;
import interfaces.Quackable;

// 具体鸭子，实现了鸭子叫接口，被观察者主题接口
public class DuckCall implements Quackable {

	// 组合方法，包含一个被观察者主题对象，用来注册或通知所有观察该鸭子对象的观察者列表。
	private Observable observable;

	public DuckCall(){
		// 创建被观察者（主题）
		observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I am RubberDuck quack");
	}

	// 最终注册调用到这里，将观察者添加到目标主题列表
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		System.out.println("DuckCall register");
		observable.registerObserver(ob);
	}
	// 鸭子对象作为主题，需要通知到所有观察者对象
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}
}
