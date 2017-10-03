package interfaces;


// 定义的抽象工厂接口
public interface AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
	public abstract Quackable createGoose();
}
