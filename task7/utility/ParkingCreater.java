package by.epam.preTraining.vladSheremet.tasks.task7.utility;



import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Car;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Lorry;
import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.container.ParkingPlace;

import java.util.ArrayList;
import java.util.Random;

public class ParkingCreater {
    public static void createParking(ParkingPlace parkingPlace, int size) {
        final String CAR_NAMES = "BMW_Audi";
        final int MARK_INDEX = 0;
        final int MAX_COST = 200_000;
        final int MIN_COST = 5_000;
        final int MAX_PASSENGER = 6;
        final int MIN_PASSENGER = 4;
        final int MAX_WEIGHT = 5_000;
        final int MIN_WIGHT = 2_000;

        ArrayList<String[]> modelList = new ArrayList<>();
        initializeModelList(modelList);

        Random random = new Random();
        String[] temp;
        int listSize = modelList.size() - 1;
        System.out.println(listSize);


        for (int i = 0; i < size; i++) {
            temp = modelList.get(random.nextInt(listSize));

            if (CAR_NAMES.contains(temp[MARK_INDEX])){
                parkingPlace.addVehicles(new Car(
                        temp[MARK_INDEX],
                        random.nextInt(MAX_COST - MIN_COST + 1) + MIN_COST,
                        temp[random.nextInt(temp.length-1)+1],
                        random.nextInt(MAX_PASSENGER - MIN_PASSENGER + 1) + MIN_PASSENGER));
            }
            else {
                parkingPlace.addVehicles(new Lorry(
                        temp[MARK_INDEX],
                        random.nextInt(MAX_COST - MIN_COST + 1) + MIN_COST,
                        temp[random.nextInt(temp.length - 1) + 1],
                        random.nextInt(MAX_WEIGHT - MIN_WIGHT + 1) + MIN_WIGHT));
            }
        }
    }

    public static void initializeModelList(ArrayList<String[]> modelList) {
        String[] arrOfBMWModels = {"BMW","5","6","3","4","7"};
        String[] arrOfAudiModels = {"Audi","A4","A5","A6","A7"};
        String[] arrOfMANModels = {"MAN","F90","19","20"};
        String[] arrOfIvecoModels = {"Iveco","Daily","Trakker","Stralis"};
        modelList.add(arrOfMANModels);
        modelList.add(arrOfAudiModels);
        modelList.add(arrOfBMWModels);
        modelList.add(arrOfIvecoModels);
        System.out.println(modelList.size());
    }
}
