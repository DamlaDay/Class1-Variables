package Example;

public class Vehicle {
    public void drive(){
        System.out.println("Vehicle is driving now");
    }
}
class Car extends Vehicle{

    public void drive(){
        System.out.println( "Repairing a car");
    }

    public static void main(String[] args) {

        Car car1=new Car();
        car1.drive();
    }
}
