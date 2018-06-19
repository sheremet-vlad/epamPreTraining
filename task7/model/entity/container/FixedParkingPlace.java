package by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Vehicle;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.intarface.Listable;

import java.util.Arrays;

public class FixedParkingPlace extends ParkingPlace implements Listable {

    private final int MAX_SIZE = 20;
    @Override
    public boolean addVehicles(Vehicle... newVehicle){
        if (getSize() == MAX_SIZE) {
            return false;
        }

        int oldSize = getSize();
        setSize(getSize()+newVehicle.length);
        setVehicles(Arrays.copyOf(getVehicles(), getSize()));

        for (int i = 0; i < newVehicle.length ; i++) {
            getVehicles()[oldSize + i] = newVehicle[i];
        }

        return true;
    }
}
