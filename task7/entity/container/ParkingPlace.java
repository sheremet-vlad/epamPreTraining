package by.epam.preTraining.vladSheremet.tasks.task7.entity.container;

import by.epam.preTraining.vladSheremet.tasks.task7.entity.Vehicle;

import java.util.Arrays;

public class ParkingPlace {

    private Vehicle[] vehicles;
    private int size;

    public ParkingPlace(){
        this.vehicles = new Vehicle[size];
    }

    public ParkingPlace(Vehicle[] newVehicles){
        vehicles = Arrays.copyOf(newVehicles, newVehicles.length);
    }

    public boolean addVehicles(Vehicle... newVehicle){
        int oldSize = size;
        size += newVehicle.length;
        vehicles = Arrays.copyOf(vehicles, size);

        for (int i = 0; i < newVehicle.length ; i++) {
            vehicles[oldSize + i] = newVehicle[i];
        }

        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void removeVehicle(int index) {
        if (index < size) {
            int removedElement = size - index - 1;
            if (removedElement > 0)
                System.arraycopy(vehicles, index + 1, vehicles, index, removedElement);
            vehicles[--size]=null;
        }
    }

    public Vehicle getVehicle(int id){
        if(id < size)
            return vehicles[id];
        return null;
    }


    public boolean isContains(Vehicle vehicle) {
        return indexOf(vehicle) >= 0;
    }

    private int indexOf(Vehicle vehicle) {
        if (vehicle != null) {
            for (int i = 0; i < size; i++) {
                if (vehicle.equals(vehicles[i])) {
                    return i;
                }
            }
        }

        return -1;
    }


    public void clear() {
        vehicles = new Vehicle[0];
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return Arrays.toString(vehicles);
    }

}
