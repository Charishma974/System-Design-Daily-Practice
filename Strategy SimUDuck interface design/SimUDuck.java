public class SimUDuck{
    public static void main(String[] args){
        MallardDuck mallardDuck=new MallardDuck();
        RedheadDuck redheadDuck=new RedheadDuck();
        RubberDuck rubberDuck=new RubberDuck();
        DecoyDuck decoyDuck=new DecoyDuck();
        
        mallardDuck.quack();
        mallardDuck.swimming();
        mallardDuck.fly();
        mallardDuck.display();
        
        System.out.println();
        
        redheadDuck.quack();
        redheadDuck.swimming();
        redheadDuck.fly();
        redheadDuck.display();
        
        System.out.println();
        
        rubberDuck.quack();
        rubberDuck.swimming();
        rubberDuck.display();
        
        System.out.println();
        
        decoyDuck.swimming();
        decoyDuck.display();
    }
}
