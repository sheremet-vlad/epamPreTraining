package by.epam.preTraining.vladSheremet.tasks.task7.model.entity;

public class Vehicle {
    private static final String DEFAULT_MARK = "unclear";
    private static final String DEFAULT_MODEL = "unclear";
    private static final int DEFAULT_COST = 10_000;

    private String mark;
    private int cost;
    private String model;

    public Vehicle() {
        this.cost = DEFAULT_COST;
        this.model = DEFAULT_MODEL;
        this.mark = DEFAULT_MARK;
    }

    public Vehicle(String mark, int cost, String model) {
        setCost(cost);
        setMark(mark);
        setModel(model);
    }

    public Vehicle(Vehicle vehicle){
        setCost(vehicle.cost);
        setMark(vehicle.mark);
        setModel(vehicle.model);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (!mark.equals("")) {
            this.mark = mark;
        }
        else {
            this.mark = DEFAULT_MARK;
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
            this.cost = DEFAULT_COST;
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
            this.model = DEFAULT_MODEL;
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
