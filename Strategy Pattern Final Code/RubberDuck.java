public class RubberDuck extends Duck {
    public void setFly(FlyBehavior fb) {
        if (fb instanceof FlyWithWings) throw new UnsupportedOperationException("Rubber ducks can't fly with wings!");
        super.setFly(fb);
    }
    public void display() {
        System.out.println("Rubber Duck Displaying...");
    }
}
