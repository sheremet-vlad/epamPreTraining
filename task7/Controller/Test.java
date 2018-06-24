package by.epam.preTraining.vladSheremet.tasks.task7.controller;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.ParkingManager;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.ParkingPlace;
import by.epam.preTraining.vladSheremet.tasks.task7.model.logic.ParkingSetting;
import by.epam.preTraining.vladSheremet.tasks.task7.model.logic.Searcher;
import by.epam.preTraining.vladSheremet.tasks.task7.model.logic.Sorter;
import by.epam.preTraining.vladSheremet.tasks.task7.utility.ParkingCreater;
import by.epam.preTraining.vladSheremet.tasks.task7.view.View;

public class Test {
    public static void test() {
        int size = 15;
        ParkingManager parkingManager = new ParkingManager(false);
        ParkingPlace parkingPlace = parkingManager.getParking();
        ParkingCreater.createParking(parkingPlace, size);

        View.println(parkingPlace.toString());

        View.println(ParkingSetting.getCheapestCar(parkingPlace).toString());

        View.println(ParkingSetting.getTotalCost(parkingPlace));

        View.println(parkingPlace.isEmpty());

        View.println(parkingPlace.getSize());

        View.println(parkingPlace.getVehicle(0));

        parkingPlace.removeVehicle(0);
        View.println(parkingPlace.toString());

        parkingPlace.clear();
        View.println(parkingPlace.toString());

        View.println("FIXED PARKING PLACE");
        int size1 = 21;
        parkingManager = new ParkingManager(true);
        parkingPlace = parkingManager.getParking();

        ParkingCreater.createParking(parkingPlace, size1); // parking will have only 20 vehicles

        View.println(parkingPlace.toString());
        View.println("\n");

        View.println(Searcher.findVehicleByCost(parkingPlace,
                        parkingPlace.getVehicle(4).getCost()));

        View.println("\n");
        View.println("Shaker sorter");
        Sorter.sortShaker(parkingPlace);
        View.println(parkingPlace.toString());

        View.println("Inserts sorter");
        Sorter.sortInserts(parkingPlace);
        View.println(parkingPlace.toString());

        View.println("Selections sorter");
        Sorter.sortSelections(parkingPlace);
        View.println(parkingPlace.toString());
    }
}
