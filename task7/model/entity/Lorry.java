package by.epam.preTraining.vladSheremet.tasks.task7.model.entity;

public class Lorry extends Vehicle {

    private static final int DEFAULT_WEIGHT = 5_000;

    private int maxWeight;

    public Lorry() {
        super();
    }

    public Lorry(String mark, int cost, String model, int maxWeight) {
        super(mark,cost,model);
        setMaxWeight(maxWeight);
    }

    public Lorry(Lorry lorry) {
        super(lorry);
        setMaxWeight(lorry.getMaxWeight());
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        if (isValidValue(maxWeight)) {
            this.maxWeight = maxWeight;
        }
        else {
            this.maxWeight  = DEFAULT_WEIGHT;
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
