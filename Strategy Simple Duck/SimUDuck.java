// Joe works for a company that makes a highly successful duck pond simulation game, SimUDuck. The game can show a large variety of duck species swimming and making quacking 
// sounds. The initial designers of the system used standard OO techniques and created one Duck superclass from which all other duck types inherit.

public class SimUDuck{
    public static void main(String[] args){
        Duck mallardDuck=new MallardDuck();
        Duck redheadDuck=new RedheadDuck();
        
        mallardDuck.quack();
        mallardDuck.swimming();
        mallardDuck.display();
        
        System.out.println();
        
        redheadDuck.quack();
        redheadDuck.swimming();
        redheadDuck.display();
    }
}
