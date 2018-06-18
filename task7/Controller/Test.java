package by.epam.preTraining.vladSheremet.tasks.task7.Controller;

import by.epam.preTraining.vladSheremet.tasks.task7.entity.Car;
import by.epam.preTraining.vladSheremet.tasks.task7.entity.Lorry;
import by.epam.preTraining.vladSheremet.tasks.task7.utility.ParkingCreater;
import logic.ParkingSetting;
import by.epam.preTraining.vladSheremet.tasks.task7.entity.container.ParkingPlace;

public class Test {
    public static void main(String[] args) {
        int size = 15;
        ParkingPlace parkingPlace = new ParkingPlace();
        ParkingCreater.createParking(parkingPlace, size);

        System.out.println(parkingPlace.toString());

        System.out.println(ParkingSetting.getCheapestCar(parkingPlace).toString());

        System.out.println(ParkingSetting.getTotalCost(parkingPlace));

        System.out.println(parkingPlace.isEmpty());

        System.out.println(parkingPlace.getSize());

        System.out.println(parkingPlace.getVehicle(0));

        //System.out.println(parkingPlace.isContains(car));

        parkingPlace.removeVehicle(0);
        System.out.println(parkingPlace.toString());

        parkingPlace.clear();
        System.out.println(parkingPlace.toString());
    }


}
