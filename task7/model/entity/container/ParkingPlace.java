package by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Vehicle;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.intarface.Listable;

import java.util.Arrays;

public class ParkingPlace implements Listable {


    private Vehicle[] vehicles;
    private int size;

    public ParkingPlace(){
        this.vehicles = new Vehicle[size];
    }

    public ParkingPlace(Vehicle[] newVehicles){
        vehicles = Arrays.copyOf(newVehicles, newVehicles.length);
    }

    public ParkingPlace(ParkingPlace parkingPlace) {
        this.vehicles = parkingPlace.vehicles;
        this.size = parkingPlace.size;
    }

    @Override
    public boolean addVehicles(Vehicle... newVehicle){
        int oldSize = size;
        size += newVehicle.length;
        vehicles = Arrays.copyOf(vehicles, size);

        for (int i = 0; i < newVehicle.length ; i++) {
            vehicles[oldSize + i] = newVehicle[i];
        }

        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void removeVehicle(int index) {
        if (index < size) {
            int removedElement = size - index - 1;
            if (removedElement > 0)
                System.arraycopy(vehicles, index + 1, vehicles, index, removedElement);
            vehicles[--size]=null;
        }
    }

    @Override
    public Vehicle getVehicle(int id){
        if(id < size)
            return vehicles[id];
        return null;
    }

    @Override
    public boolean isContains(Vehicle vehicle) {
        return indexOf(vehicle) >= 0;
    }

    @Override
    public int indexOf(Vehicle vehicle) {
        if (vehicle != null) {
            for (int i = 0; i < size; i++) {
                if (vehicle.equals(vehicles[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public void clear() {
        vehicles = new Vehicle[0];
        size = 0;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    @Override
    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        StringBuilder outString = new StringBuilder();
        outString.append("ParkingPlace:\n");
        for (Vehicle temp : vehicles  ) {
            outString.append(temp.toString());
            outString.append("\n");
        }

        return outString+"";
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = super.hashCode();
        int size = this.getSize();

        for (int i = 0; i < size; i++) {
            result += this.getVehicle(i).hashCode();
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ParkingPlace parkingPlace = (ParkingPlace) obj;

        if (parkingPlace.getSize() != this.getSize()) {
            return false;
        }

        for (int i = 0; i < this.getSize(); i++) {
            if (!this.getVehicle(i).equals(parkingPlace.getVehicle(i))) {
                return false;
            }
        }
        return  true;

    }

}
