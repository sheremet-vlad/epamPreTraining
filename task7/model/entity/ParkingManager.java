package by.epam.preTraining.vladSheremet.tasks.task7.model.entity;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.FixedParkingPlace;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.ParkingPlace;

public class ParkingManager {
    private ParkingPlace parking;

    public ParkingManager() {
        parking = new ParkingPlace();
    }

    public ParkingManager(boolean isFixed) {
        if (isFixed) {
            parking = new FixedParkingPlace();
        }
        else {
            parking = new ParkingPlace();
        }
    }

    public ParkingManager(ParkingManager parkingManager) {
        parking = parkingManager.parking;

    }

    public ParkingPlace getParking() {
        return parking;
    }

    public void setParking(ParkingPlace parking) {
        this.parking = parking;
    }
}
