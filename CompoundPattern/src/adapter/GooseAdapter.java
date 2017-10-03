package adapter;
import observer.Observable;
import interfaces.Observer;
import interfaces.Quackable;



// 适配器模式，传入鹅对象，经过时配置实现，调用到鹅的叫

public class GooseAdapter implements Quackable {

	private Observable observable;
	private Goose goose;
	public GooseAdapter(Goose goose){
		this.goose = goose;
		observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		System.out.println("GooseAdapter register");
		observable.registerObserver(ob);
	}
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

}
