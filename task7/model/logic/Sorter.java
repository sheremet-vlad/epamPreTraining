package by.epam.preTraining.vladSheremet.tasks.task7.model.logic;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Vehicle;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.ParkingPlace;

import java.util.Arrays;

public class Sorter {
    //shaker is an improved bubble
    public static void sortShaker(ParkingPlace arr) {
        boolean isSortiong;
        int size = arr.getSize() / 2;
        int endIndex;

        for (int i = 0; i < size; i++) {
            isSortiong = true;
            endIndex = arr.getSize() - i - 1;
            for (int j = i; j < endIndex; j++) {
                if (arr.getVehicle(j).getCost() < arr.getVehicle(j + 1).getCost()) {
                    swap(j,j + 1, arr);
                    isSortiong = false;
                }
            }

            if (isSortiong) {
                break;
            }

            for (int j = endIndex - 1; j > i; j--) {
                if (arr.getVehicle(j).getCost() > arr.getVehicle(j - 1).getCost()) {
                    swap(j, j - 1, arr);
                    isSortiong = false;
                }
            }

            if (isSortiong) {
                break;
            }
        }
    }

    private static void swap(int i, int j, ParkingPlace arr){
        Vehicle temp = arr.getVehicle(i);
        arr.changeVehicle(arr.getVehicle(j),i);
        arr.changeVehicle(temp,j);
    }
}
