public abstract class Duck{
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public void setFly(FlyBehavior obj){
        flyBehavior=obj;
    }
    public void setQuack(QuackBehavior obj){
        quackBehavior=obj;
    }
    public void performFly(){
        if (flyBehavior != null) {
            flyBehavior.fly();
        } else {
            System.out.println("This duck can't fly!");
        }
    }
    public void performQuack(){
        if (quackBehavior != null) quackBehavior.quack();
        else System.out.println("This duck can't quack");
    }
    public void swim(){
        System.out.println("Swimming...");
    }
    public abstract void display();
}
