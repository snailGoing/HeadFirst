package duck;
import observer.Observable;
import interfaces.Observer;
import interfaces.Quackable;

// ����Ѽ�ӣ�ʵ����Ѽ�ӽнӿڣ����۲�������ӿ�
public class DuckCall implements Quackable {

	// ��Ϸ���������һ�����۲��������������ע���֪ͨ���й۲��Ѽ�Ӷ���Ĺ۲����б�
	private Observable observable;

	public DuckCall(){
		// �������۲��ߣ����⣩
		observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I am RubberDuck quack");
	}

	// ����ע����õ�������۲�����ӵ�Ŀ�������б�
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		System.out.println("DuckCall register");
		observable.registerObserver(ob);
	}
	// Ѽ�Ӷ�����Ϊ���⣬��Ҫ֪ͨ�����й۲��߶���
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}
}
