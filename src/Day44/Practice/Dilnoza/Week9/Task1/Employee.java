package Day44.Practice.Dilnoza.Week9.Task1;

public class Employee {

    double baseSalary;
    double hourlyRate;
    public int numberOfEmployees;
    private static int counter=0;


    public Employee(double baseSalary, double hourlyRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
        if(baseSalary<=0 || hourlyRate<0){
            hourlyRate=14.20;
            baseSalary= (hourlyRate*40);}

        }
        public double calculateWage(double extraHours){
                double wage;
            return (wage= baseSalary+(hourlyRate*extraHours)*1.5);
    }

    public int getNumberOfEmployees(){
        counter++;
       return numberOfEmployees=counter;
    }









}
