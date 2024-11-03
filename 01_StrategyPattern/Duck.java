public abstract class Duck{
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public void Duck() { }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    
    public static void swim() {
        System.out.println("All ducks floats, even decoys");
    }
}