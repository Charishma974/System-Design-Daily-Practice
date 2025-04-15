public class SimUDuck{
    public static void main(String[] args){
        Duck mallardDuck=new MallardDuck();
        
        // mallardDuck.setFly(new FlyNoWay());
        mallardDuck.setFly(new FlyWithWings());
        mallardDuck.setQuack(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        
        System.out.println("\n");
        
        // Duck rubberDuck=new RubberDuck();
        // rubberDuck.setFly(new FlyWithWings());
        // rubberDuck.performFly();
        
        // Duck decoyDuck = new DecoyDuck();
        // decoyDuck.setFly(new FlyWithWings());
    }
}
