package interfaces;

// ����ı��۲��߽ӿڣ����⣩
public interface QuackObservable {

	public void registerObserver(Observer ob);
	public void notifyObservers();// �����۲��ߣ����⣩״̬�ı�ʱ���˷����ͻ���ã�����֪ͨ���й۲�
}
