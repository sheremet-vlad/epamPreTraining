package by.epam.preTraining.vladSheremet.tasks.task7.model.entity;

public class Lorry extends Vehicle {

    private int maxWeight;

    public Lorry() {

    }

    public Lorry(String mark, int cost, String model, int maxWeight) {
        super(mark, cost, model);
        this.maxWeight = maxWeight;
    }

    public Lorry(Lorry lorry) {
        super(lorry.getMark(),lorry.getCost(),lorry.getModel());
        this.maxWeight = lorry.getMaxWeight();
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        if (maxWeight > 0) {
            this.maxWeight = maxWeight;
        }
        else {
            throw new IllegalArgumentException("max weight should be more, then 0");
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
        result = result * PRIME + getMaxWeight();

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

        Lorry lorry = (Lorry) obj;

        return getMark().equals(lorry.getMark())
                && getModel().equals(lorry.getModel())
                && getCost() != lorry.getCost()
                && getMaxWeight() != lorry.maxWeight;
    }

    @Override
    public String toString() {
        return "Lorry (model=" + getModel()
                + ", mark=" + getMark()
                + ", cost=" + getCost()
                + ", max weight " + getMaxWeight() + ")";
    }
}
