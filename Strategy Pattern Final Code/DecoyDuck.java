public class DecoyDuck extends Duck{
    public void setFly(FlyBehavior fb){
        if (fb instanceof FlyWithWings) throw new UnsupportedOperationException("Decoy ducks can't fly with wings!");
        else super.setFly(fb);
    }
    public void setQuack(QuackBehavior qb){
        if (qb instanceof QuackBehavior) throw new UnsupportedOperationException("Decoy ducks can't quack!");
        else super.setQuack(qb);
    }
    public void display(){
        System.out.println("Mallard Duck Displaying...");
    }
}
