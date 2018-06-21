package by.epam.preTraining.vladSheremet.tasks.task7.model.logic;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Vehicle;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.ParkingPlace;

public class Searcher {
    public static Vehicle findVehicleByCost(ParkingPlace parking, int cost) {
        int size = parking.getSize();

        for (int i = 0; i < size; i++) {
            if (parking.getVehicle(i).getCost() == cost){
                return  parking.getVehicle(i);
            }
        }

        return null;
    }
}
