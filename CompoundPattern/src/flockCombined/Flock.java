package flockCombined;
import interfaces.Observer;
import interfaces.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

import observer.Observable;

// 管理一群鸭子，使用组合模式，将许多quackable集结一个群。该模式允许群中有群。
public class Flock implements Quackable {

	// 保存添加所有的鸭子对象（每个鸭子对象都是一个主题）
	private ArrayList quackers = new ArrayList();
	// 添加多个鸭子主题
	public void add(Quackable quackable){
		quackers.add(quackable);
	}
	// 模拟所有类型鸭子叫
	public void quack() {
		// TODO Auto-generated method stub
		// 迭代器模式
		Iterator it = quackers.iterator();
		while(it.hasNext()){
			((Quackable)it.next()).quack();
		}
	}

	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		// 迭代器模式
		Iterator it = quackers.iterator();
		while(it.hasNext()){
			((Quackable)it.next()).registerObserver(ob);
		}
	}
	public void notifyObservers() {
		// TODO Auto-generated method stub
		// 迭代器模式
		Iterator it = quackers.iterator();
		while(it.hasNext()){
			((Quackable)it.next()).notifyObservers();
		}
	}

}
