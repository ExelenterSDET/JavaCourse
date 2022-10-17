package Day46.StudentReg;

public class School {
    public static void main(String[] args) {
        Registration registration = new Registration("Arthur",Months.April);
        Registration registration1 = new Registration("James",Months.March);
        Months january = Months.January;
        january.print();
        //registration.setWhichMonth(Months.April);
        //System.out.println(registration.WhichMonth);
    }
}
