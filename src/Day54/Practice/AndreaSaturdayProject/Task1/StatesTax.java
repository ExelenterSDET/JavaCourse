package Day54.Practice.AndreaSaturdayProject.Task1;

public enum StatesTax {

    NEW_YORK(20),
    NEW_JERSEY(15),
    FLORIDA(5),
    OHIO(12);

    private final int taxRate;

    StatesTax(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTaxRate() {
        return taxRate;
    }

}
