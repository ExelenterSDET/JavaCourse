package Day47.Java.Example;

public enum Month {
    JANUARY(1, "01 - January"),
    FEBRUARY(2, "02 - February"),
    MARCH(3, "03 - March"),
    APRIL(4, "04 - April"),
    MAY(5, "05 - May"),
    JUNE(6, "06 - June"),
    JULY(7, "07 - July"),
    AUGUST(8, "08 - August"),
    SEPTEMBER(9, "09 - September"),
    OCTOBER(10, "10 - October"),
    NOVEMBER(11, "11 - Nonvember"),
    DECEMBER(12, "12 - December");

    int whichMonth;
    String monthDetails;

    Month(int whichMonth, String monthDetails) {
        this.whichMonth = whichMonth;
        this.monthDetails = monthDetails;
    }


    public int getWhichMonth() {
        return whichMonth;
    }

    public String getMonthDetails() {
        return monthDetails;
    }

    public void print(){
        System.out.println("Enum => " + this);
        System.out.println("Which Month => " + this.whichMonth);
        System.out.println("Month details => " + this.monthDetails);
    }
}
