package by.epam.preTraining.vladSheremet.tasks.task7.entity;

public abstract class Vehicle {
    private String mark;
    private int cost;
    private String model;

    public Vehicle() {

    }

    public Vehicle(String mark, int cost, String model) {
        setCost(cost);
        setMark(mark);
        setModel(model);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (!mark.equals("")) {
            this.mark = mark;
        }
        else {
            throw new IllegalArgumentException("field mark should be not empty");
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        }
        else {
            throw new IllegalArgumentException("cost should be more, then 0");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.equals("")) {
            this.model = model;
        }
        else {
            throw new IllegalArgumentException("field mark should be not empty");
        }
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = super.hashCode();
        int len = mark.length();

        for (int i = 0; i < len; i++) {
            result += (int)mark.charAt(i) * PRIME ^ len - i;
        }

        len = model.length();
        for (int i = 0; i < len; i++) {
            result += (int)model.charAt(i) * PRIME ^ len - i;
        }

        result = result * PRIME + cost;

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

        Vehicle vehicle = (Vehicle) obj;
        return  mark.equals(vehicle.mark)
                && model.equals(vehicle.model)
                && cost != vehicle.cost;

    }

    @Override
    public String toString() {
        return "Vehicle (model=" + model
                + ", mark=" + mark
                + ", cost=" + cost + ")";
    }
}
