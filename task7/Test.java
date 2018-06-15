import entity.Car;
import entity.Lorry;
import entity.Vehicle;
import logic.ParkingSetting;
import utility.ParkingPlace;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ParkingPlace parkingPlace = new ParkingPlace();

        Car car = new Car("Fiat",5_000,"Punto",4);
        parkingPlace.addVehicles(new Lorry("Man",100_000,"F90",2000));
        parkingPlace.addVehicles(new Lorry("Man",50_000,"19",1000));
        parkingPlace.addVehicles(new Car("Audi",130_000,"RS7",4));
        parkingPlace.addVehicles(new Car("Audi",95_000,"Q7",5));
        parkingPlace.addVehicles(new Car("BMW",50_000,"5",4), car);
        System.out.println(parkingPlace.toString());

        System.out.println(ParkingSetting.getCheapestCar(parkingPlace).toString());

        System.out.println(ParkingSetting.getTotalCost(parkingPlace));

        System.out.println(parkingPlace.isEmpty());

        System.out.println(parkingPlace.getSize());

        System.out.println(parkingPlace.getVehicle(0));

        System.out.println(parkingPlace.isContains(car));

        parkingPlace.removeVehicle(0);
        System.out.println(parkingPlace.toString());

        parkingPlace.clear();
        System.out.println(parkingPlace.toString());
    }


}
