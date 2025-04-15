public class MallardDuck extends Duck{
    public void setFly(FlyBehavior fb){
        if (fb instanceof FlyNoWay) throw new UnsupportedOperationException("Mallard ducks can fly!");
        else super.setFly(fb);
    }
    public void setQuack(QuackBehavior qb){
        if (qb instanceof MuteQuack) throw new UnsupportedOperationException("Mallard ducks can quack!");
        else super.setQuack(qb);
    }
    public void display(){
        System.out.println("Mallard Duck Displaying...");
    }
}
