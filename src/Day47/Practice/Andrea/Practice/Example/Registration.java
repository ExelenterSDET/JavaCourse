package Day47.Practice.Andrea.Practice.Example;

public class Registration {

    String studentName;
    Month month;
    int whichMonth;

    public Registration(String name, Month month){
        this.studentName = name;
        this.month= month;
//        setWhichMonth(this.month);
        this.whichMonth = this.month.getWhichMonth();
    }

    @Override
    public String toString() {
        return "Registration{" +
                "studentName='" + studentName + '\'' +
                ", month=" + month +
                ", whichMonth=" + whichMonth +
                '}';
    }
// this code has been replaced by the enum constructor
    public void setWhichMonth(Month month){
        switch (month){
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
