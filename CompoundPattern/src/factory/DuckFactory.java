package factory;
import adapter.Goose;
import adapter.GooseAdapter;
import interfaces.AbstractDuckFactory;
import interfaces.Quackable;
import decorater.QuackCounterDecorater;
import duck.DuckCall;
import duck.MallardDuck;
import duck.RedHeadDuck;
import duck.RubberDuck;



// 工厂模式实现中，使用装饰者模式获取具体鸭子类型
public class DuckFactory implements AbstractDuckFactory {

	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCounterDecorater(new MallardDuck());
	}

	public Quackable createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounterDecorater(new RedHeadDuck());
	}

	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new QuackCounterDecorater(new DuckCall());
	}

	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounterDecorater(new RubberDuck());
	}

	public Quackable createGoose() {
		// TODO Auto-generated method stub
		//return new GooseAdapter(new Goose());
		return new QuackCounterDecorater(new GooseAdapter(new Goose()));
	}

}
