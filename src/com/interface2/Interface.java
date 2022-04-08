package com.interface2;

//Interfaces
interface Vehicle {
    String name="Car-XY";
    int maxPassenger=5;
    double maxSpeed=120.72;
}
interface LandVehicle extends Vehicle {
    int numWheel=4;
    void drive();
}
interface SeaVehicle extends Vehicle {
    double displacement=20.0;
    void launch();
}

//Classes
class Car implements LandVehicle {
    public void drive() {
        System.out.println("Driving car "+name);
    }
    public void details() {
        System.out.println("Car's maximum speed is "+maxSpeed+" and maximum passengers allowed are "+maxPassenger);
        System.out.println("No of wheels are "+numWheel);
    }
}

class Hovecraft implements LandVehicle,SeaVehicle {
    public void drive() {
        System.out.println("Driving Hovercraft");
    }
    public void launch() {
        System.out.println("Launching Hovercraft");
    }
    public void enterland() {
        System.out.println("Entering land");
    }
    public void entersea() {
        System.out.println("Entering sea");
    }
}

class Ship implements SeaVehicle {
    public void launch() {
        System.out.println("Launching the ship");
    }
    public void howFar() {
        System.out.println("The ship's displacement from port is "+displacement);
    }
}

public class Interface {
    public static void main(String args[]) {
        System.out.println("Land Vehicle : ");
        LandVehicle l=new Car();
        l.drive();
        System.out.println();

        System.out.println("Car : ");
        Car c=new Car();
        c.details();
        System.out.println();

        System.out.println("Hovercraft : ");
        Hovecraft h=new Hovecraft();
        h.drive();
        h.launch();
        h.enterland();
        h.entersea();
        System.out.println();

        System.out.println("Sea Vehicle : ");
        SeaVehicle s=new Ship();
        s.launch();
        System.out.println();

        System.out.println("Ship : ");
        Ship s2=new Ship();
        s2.howFar();

    }
}
