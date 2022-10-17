package Day46.StudentReg;

public class Registration {
    String StudentName;
    Months months;

    int WhichMonth;

    public Registration(String studentName, Months months) {
        this.StudentName = studentName;
        this.months = months;
 //       setWhichMonth(this.months);
        this.WhichMonth = this.months.getWhichmonth();
    }

    @Override
    public String toString() {
        return "Registration{" +
                "StudentName='" + StudentName + '\'' +
                ", months=" + months +
                ", WhichMonth=" + WhichMonth +
                '}';
    }

    public void setWhichMonth(Months months) {

            switch (months)
            {
                case January:
                    this.WhichMonth = 1;
                    break;
                case February:
                    this.WhichMonth = 2;
                    break;
                case March:
                    this.WhichMonth = 3;
                    break;
                case April:
                    this.WhichMonth = 4;
                    break;
                case May:
                    this.WhichMonth = 5;
                    break;
                case June:
                    this.WhichMonth = 6;
                    break;
                case July:
                    this.WhichMonth = 7;
                    break;
                case August:
                    this.WhichMonth = 8;
                    break;
                case September:
                    this.WhichMonth = 9;
                    break;
                case October:
                    this.WhichMonth = 10;
                    break;
                case November:
                    this.WhichMonth = 11;
                    break;
                case December:
                    this.WhichMonth = 12;
                    break;
            }

    }
}
