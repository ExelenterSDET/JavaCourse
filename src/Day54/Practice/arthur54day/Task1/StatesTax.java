package Day54.Practice.arthur54day.Task1;

public enum StatesTax {

    NEW_YORK(20),
    NEW_JERSEY(15),
    FLORIDA(5),
    OHIO(12);

    int tax;

    StatesTax(int tax){
        this.tax= tax;
    }

    public int getStatesTax() {
        return tax;
    }

}
