package interfaces;

// 观察者
public interface Observer {
	public void update(QuackObservable quackable);// 当主题状态改变时，会将主题对象作为方法参数传递给观察者
}
