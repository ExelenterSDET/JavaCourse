package Day54.Practice.Ibrahim_SP.Task1;

public enum StatesTax {
    NEW_YORK(20),
    NEW_JERSEY(15),
    FLORIDA(5),
    OHIO(12);

    final int taxRate;

    StatesTax(int taxRate) {
        this.taxRate = taxRate;
    }
}
