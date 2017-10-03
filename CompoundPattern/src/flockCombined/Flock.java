package flockCombined;
import interfaces.Observer;
import interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

import observer.Observable;

// ����һȺѼ�ӣ�ʹ�����ģʽ�������quackable����һ��Ⱥ����ģʽ����Ⱥ����Ⱥ��
public class Flock implements Quackable {

	// ����������е�Ѽ�Ӷ���ÿ��Ѽ�Ӷ�����һ�����⣩
	private ArrayList quackers = new ArrayList();
	// ��Ӷ��Ѽ������
	public void add(Quackable quackable){
		quackers.add(quackable);
	}
	// ģ����������Ѽ�ӽ�
	public void quack() {
		// TODO Auto-generated method stub
		// ������ģʽ
		Iterator it = quackers.iterator();
		while(it.hasNext()){
			((Quackable)it.next()).quack();
		}
	}

	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		// ������ģʽ
		Iterator it = quackers.iterator();
		while(it.hasNext()){
			((Quackable)it.next()).registerObserver(ob);
		}
	}
	public void notifyObservers() {
		// TODO Auto-generated method stub
		// ������ģʽ
		Iterator it = quackers.iterator();
		while(it.hasNext()){
			((Quackable)it.next()).notifyObservers();
		}
	}

}
