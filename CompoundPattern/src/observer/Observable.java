package observer;

import interfaces.Observer;
import interfaces.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;

// 被观察者-主题，需要主动通知观察者发生的变化
public class Observable implements QuackObservable {

	QuackObservable duck;
	// 保存所有的观察者对象
	ArrayList observers = new ArrayList();
	public Observable(QuackObservable duck){
		this.duck = duck;

	}
	// 被观察者（主题）添加观察者注册对象
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.add(ob);

	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		Iterator it = observers.iterator();
		while(it.hasNext()){
			Observer obsever =(Observer) it.next();
			obsever.update(duck);
		}
	}

}
