package Day44.Practice.Dilnoza.Week9.Task1;

public class Employee {
    public double baseSalary;
    public double hourlyRate;
    private static  int numberOfEmployees = 0;


    public Employee(double baseSalary, double hourlyRate) {

        if( hourlyRate>0){
            this.hourlyRate = hourlyRate;}
        else{
            hourlyRate=14.20;
        }
        this.baseSalary= (hourlyRate*40);
        numberOfEmployees++;

    }
    public double calculateWage(double extraHours){
        return ( baseSalary+(hourlyRate*extraHours)*1.5);
    }

    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }



//
//    double baseSalary;
//    double hourlyRate;
//    public int numberOfEmployees;
//    private static int counter=0;
//
//
//    public Employee(double baseSalary, double hourlyRate) {
//        this.baseSalary = baseSalary;
//        this.hourlyRate = hourlyRate;
//        if(baseSalary<=0 || hourlyRate<0){
//            hourlyRate=14.20;
//            baseSalary= (hourlyRate*40);}
//
//        }
//        public double calculateWage(double extraHours){
//                double wage;
//            return (wage= baseSalary+(hourlyRate*extraHours)*1.5);
//    }
//
//    public static int getNumberOfEmployees(){
//        counter++;
//       return numberOfEmployees=counter;
//    }
//
//







}
