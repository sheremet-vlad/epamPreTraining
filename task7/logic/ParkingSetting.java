package logic;

import by.epam.preTraining.vladSheremet.tasks.task7.entity.Vehicle;
import by.epam.preTraining.vladSheremet.tasks.task7.entity.container.ParkingPlace;

public class ParkingSetting {
    public static int getTotalCost(ParkingPlace arr) {
        int totalCount = 0;
        int size;
        if (!arr.isEmpty()){
            size = arr.getSize();
            for (int i = 0; i < size; i++) {
                totalCount += arr.getVehicle(i).getCost();
            }
        }

        return totalCount;
    }


    public static Vehicle getCheapestCar(ParkingPlace arr) {
        int minCost = arr.getVehicle(0).getCost();
        int size;
        Vehicle temp, cheapestVehicle = arr.getVehicle(0);
        if (!arr.isEmpty()){
            size = arr.getSize();
            for (int i = 0; i < size; i++) {
                temp = arr.getVehicle(i);
                if (minCost > temp.getCost()){
                    minCost = temp.getCost();
                    cheapestVehicle = temp;
                }
            }
        }

        return cheapestVehicle;
    }
}
