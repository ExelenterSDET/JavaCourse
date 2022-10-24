package Day54.Practice.DilnozaSP.Task1;

public enum StatesTax {

    NEW_YORK(20),
    NEW_JERSEY(15),
    FLORIDA(5),
    OHIO(12);
    private final int rate;

    StatesTax(int rate) {

        this.rate = rate;
    }


    public int getRate() {
        return rate;
    }
}
