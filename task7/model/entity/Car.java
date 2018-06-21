package by.epam.preTraining.vladSheremet.tasks.task7.model.entity;

import by.epam.preTraining.vladSheremet.tasks.task7.model.entity.Vehicle;

public class Car extends Vehicle {

    private static final int DEFAULT_PASSENGER = 4;

    private int maxPassenger;

    public Car() {
        super();
    }

    public Car(String mark, int cost, String model, int maxPassenger) {
        setMark(mark);
        setCost(cost);
        setModel(model);
        this.maxPassenger = maxPassenger;
    }

    public Car(Car car) {
        setMark(car.getMark());
        setCost(car.getCost());
        setModel(car.getModel());
        setMaxPassenger(car.getMaxPassenger());
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        if (isValidValue(maxPassenger)) {
            this.maxPassenger = maxPassenger;
        }
        else {
            this.maxPassenger = DEFAULT_PASSENGER;
        }
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = super.hashCode();
        int len = getMark().length();

        for (int i = 0; i < len; i++) {
            result += (int)getMark().charAt(i) * PRIME ^ len - i;
        }

        len = getModel().length();
        for (int i = 0; i < len; i++) {
            result += (int)getModel().charAt(i) * PRIME ^ len - i;
        }

        result = result * PRIME + getCost();
        result = result * PRIME + getMaxPassenger();

        return result ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Car car = (Car) obj;

        return getMark().equals(car.getMark())
                && getModel().equals(car.getModel())
                && getCost() != car.getCost()
                && getMaxPassenger() != car.maxPassenger;
    }

    @Override
    public String toString() {
        return "car (model=" + getModel()
                + ", mark=" + getMark()
                + ", cost=" + getCost()
                + ", max Passenger " + getMaxPassenger() + ")";
    }
}
