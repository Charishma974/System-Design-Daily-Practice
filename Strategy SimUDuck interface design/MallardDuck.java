public class MallardDuck extends Duck implements Quackable,Flyable{
    public void quack(){
        System.out.println("Quacking...");
    }
    public void fly(){
        System.out.println("Flying...");
    }
    public void display(){
        System.out.println("Mallard Duck Displaying...");
    }
}
