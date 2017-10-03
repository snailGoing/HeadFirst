package interfaces;

// 定义的被观察者接口（主题）
public interface QuackObservable {

	public void registerObserver(Observer ob);
	public void notifyObservers();// 当被观察者（主题）状态改变时，此方法就会调用，用来通知所有观察
}
