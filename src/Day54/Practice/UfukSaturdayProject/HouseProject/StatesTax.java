package Day54.Practice.UfukSaturdayProject.HouseProject;

public enum StatesTax {
    NEW_YORK(20),
    NEW_JERSEY(15),
    FLORIDA(5),
    OHIO(12);

    private int rate;

    public int getRate() {
        return rate;
    }

    StatesTax(int rate) {
        this.rate = rate;
    }
}
