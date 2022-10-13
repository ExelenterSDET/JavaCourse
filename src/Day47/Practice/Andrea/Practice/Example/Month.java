package Day47.Practice.Andrea.Practice.Example;

public enum Month {

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    int whichMonth;
    Month(int whichMonth) {
        this.whichMonth = whichMonth;
    }

    public int getWhichMonth() {
        return whichMonth;
    }
}
