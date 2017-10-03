package observer;

import interfaces.Observer;
import interfaces.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;

// ���۲���-���⣬��Ҫ����֪ͨ�۲��߷����ı仯
public class Observable implements QuackObservable {

	QuackObservable duck;
	// �������еĹ۲��߶���
	ArrayList observers = new ArrayList();
	public Observable(QuackObservable duck){
		this.duck = duck;

	}
	// ���۲��ߣ����⣩��ӹ۲���ע�����
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
