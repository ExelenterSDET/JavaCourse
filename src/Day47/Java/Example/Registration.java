package Day47.Java.Example;

public class Registration {
    String studentName;
    Month month;

    int whichMonth;
    String monthDetails;

    /*

    January => 1
    February => 2
    etc...

     */

    public Registration(String studentName, Month month) {
        this.studentName = studentName;
        this.month = month;
//        setWhichMonth(this.month);
        this.whichMonth = this.month.getWhichMonth();
        this.monthDetails = this.month.getMonthDetails();
    }

    @Override
    public String toString() {
        return "Registration{" +
                "studentName='" + studentName + '\'' +
                ", month=" + month +
                ", whichMonth=" + whichMonth +
                ", monthDetails='" + monthDetails + '\'' +
                '}';
    }

    // this method has been replaced
    // with the enum constructor and the value has been called with getWhichMonth method
    public void setWhichMonth(Month month) {
        switch (month) {
            case JANUARY:
                whichMonth = 1;
                break;
            case FEBRUARY:
                whichMonth = 2;
                break;
            case MARCH:
                whichMonth = 3;
                break;
            case APRIL:
                whichMonth = 4;
                break;
            case MAY:
                whichMonth = 5;
                break;
            case JUNE:
                whichMonth = 6;
                break;
            case JULY:
                whichMonth = 7;
                break;
            case AUGUST:
                whichMonth = 8;
                break;
            case SEPTEMBER:
                whichMonth = 9;
                break;
            case OCTOBER:
                whichMonth = 10;
                break;
            case NOVEMBER:
                whichMonth = 11;
                break;
            case DECEMBER:
                whichMonth = 12;
                break;
        }
    }
}
