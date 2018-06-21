package by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.intarface;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Vehicle;

import java.util.Arrays;

public interface Listable  {

    boolean addVehicles(Vehicle... newVehicle);

    void changeVehicle(Vehicle vehicle, int index);

    boolean isEmpty();

    void removeVehicle(int index);

    Vehicle getVehicle(int id);

    boolean isContains(Vehicle vehicle);

    int indexOf(Vehicle vehicle);

    void clear();

    int getSize();

    void setSize(int size);

    Vehicle[] getVehicles();

    void setVehicles(Vehicle[] vehicles);
}
