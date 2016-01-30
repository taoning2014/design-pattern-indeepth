package DelegateDesignPattern;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.performSwim();
	}
}
