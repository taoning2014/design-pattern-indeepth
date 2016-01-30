package DelegateDesignPattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performSwim() {
		System.out.println("I'm swimming, every kind of duck can swims");
	}
}
