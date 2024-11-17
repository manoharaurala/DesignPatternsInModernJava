package oopVsDataOrientedProgramming;

import oopVsDataOrientedProgramming.thirdParty.concreteImpl.Car;
import oopVsDataOrientedProgramming.thirdParty.concreteImpl.Truck;
import oopVsDataOrientedProgramming.thirdParty.interfaces.Vehicle;

public class Client {
    public static void main(String[] args) {
        System.out.println(process(new Car()));
        System.out.println(process(new Truck()));

    }

    public static String carProcess(Car car){
        return "Processing Car...logic goes here";
    }
    public static String process(Vehicle vehicle){
        return switch (vehicle){
            case Car car ->carProcess(car);
            case Truck truck ->"Processing Truck...logic goes here";
            default->"no clue";
        };

    }
}
