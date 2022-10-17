package Day46.StudentReg;

public enum Months {
    January(1,"Start of registration period"), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(10), November(11), December(12);
    int whichmonth;
    String Comments;
    Months(int whichmonth )
    {
        this.whichmonth = whichmonth;
    }

    Months(int whichmonth, String comments) {
        this.whichmonth = whichmonth;
        Comments = comments;
    }

    public String getComments() {
        return Comments;
    }

    public int getWhichmonth() {
        return whichmonth;
    }
    public void print()
    {
        System.out.println("Enum " + this);
        System.out.println("Which Month " +this.whichmonth);
        System.out.println("Month details "+this.Comments);

    }

    @Override
    public String toString() {
        return "Months{" +
                "whichmonth=" + whichmonth +
                ", Comments='" + Comments + '\'' +
                '}';
    }
}
