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
		// ���󹤳�ģʽ
		AbstractDuckFactory duckFactiory = new DuckFactory();
		simulator.simulate(duckFactiory);
	}


	public void simulate(AbstractDuckFactory duckFactiory){
		// ����Ⱥ�����������
		Flock flock = new Flock();
		// ������������Ѽ���������
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
		// �����۲����������԰����У�ֻ�д�һ���۲��߶���,����Ѽ�ӵı仯��Ҫ֪ͨ�ù۲���
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
