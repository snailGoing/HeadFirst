import adapter.Goose;
import adapter.GooseAdapter;
import observer.QuackLogist;
import decorater.QuackCounterDecorater;
import factory.DuckFactory;
import flockCombined.Flock;
import interfaces.AbstractDuckFactory;
import interfaces.Quackable;


public class DuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuckSimulator simulator = new DuckSimulator();
		// 抽象工厂模式
		AbstractDuckFactory duckFactiory = new DuckFactory();
		simulator.simulate(duckFactiory);
	}


	public void simulate(AbstractDuckFactory duckFactiory){
		// 创建群管理主题对象
		Flock flock = new Flock();
		// 创建单个具体鸭子主题对象
		Quackable mallarDuck = duckFactiory.createMallardDuck();
		Quackable redHeadDuck = duckFactiory.createRedHeadDuck();
		Quackable duckCall = duckFactiory.createDuckCall();
		Quackable rubberDuck = duckFactiory.createRubberDuck();

		Quackable goose = duckFactiory.createGoose();

		flock.add(mallarDuck);
		flock.add(rubberDuck);
		flock.add(duckCall);
		flock.add(redHeadDuck);

		flock.add(goose);

		System.out.println("Duck Simulator start...\n");
		// 创建观察对象，这个测试案例中，只有此一个观察者对象,所有鸭子的变化都要通知该观察者
		QuackLogist ql = new QuackLogist();
		flock.registerObserver(ql);
		simulate(flock);
		flock.notifyObservers();
		
		System.out.println("\n The ducks quacked :  "+QuackCounterDecorater.getQuacks()+" times!");

	}

	public void simulate(Quackable quackable){
		quackable.quack();
	}
}
