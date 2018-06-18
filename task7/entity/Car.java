package by.epam.preTraining.vladSheremet.tasks.task7.entity;

public class Car extends Vehicle{

    private int maxPassenger;

    public Car(String mark, int cost, String model, int maxPassenger) {
        super(mark, cost, model);
        this.maxPassenger = maxPassenger;

    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        if (maxPassenger > 0) {
            this.maxPassenger = maxPassenger;
        }
        else {
            throw new IllegalArgumentException("max Passenger should be more, then 0");
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
