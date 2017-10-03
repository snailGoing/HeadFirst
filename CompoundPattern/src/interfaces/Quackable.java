package interfaces;

// 定义鸭子叫接口，以及具有被观察者接口
public interface Quackable extends QuackObservable  {
	public void quack();// 叫接口
}
