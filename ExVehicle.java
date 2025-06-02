/* write a java program to create a base class Vehicle with methods startEngine() and stopEngine().
Create two subclasses car and motorCycle. Override the startEngine() and stopENgine() methods in 
each subclass to start and stop the engines differently.*/
import java.util.*;
class Vehicle {
    public void startEngine(){

    }
    public void stopEngine(){
        
    }
}
class Car extends Vehicle {
    public void startEngine()
    {
        System.out.println("Car Engine started");
    }
    public void stopEngine()
    {
        System.out.println("Car Engine Stop");
    }
}

class MotorCycle extends Vehicle {
    public void startEngine()
    {
        System.out.println("Motor Cycle Engine started");
    }
    public void stopEngine()
    {
        System.out.println("Motor Cycle Engine Stop");
    }
}

class ExVehicle{
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Car c = new Car();
        MotorCycle m = new MotorCycle();
        c.startEngine();
        c.stopEngine();
        m.startEngine();
        m.stopEngine();
    }
}