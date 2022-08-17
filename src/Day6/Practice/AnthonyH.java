package Day6.Practice;

public class AnthonyH {

    public static void main(String[] args) {

        String a = " EXELENTER ";
        String b = "SDET";
        String c = a.concat(b);
        System.out.println("TASK 1 ="+c);

        // Create 3 Strings and using concat method print United States of America"

        String a1 = " UNITED ";
        String a2 = "STATES OF ";
        String a3 = "AMERICA";
        System.out.println("TASK 2 ="+(a1).concat(a2).concat(a3));

        String country = "United States of America"; // alt + enter
        //Length method return number of character in the string
        int countryLength = country.length();// when you type . (need to see the method and the end type as well the parameters)
        System.out.println("TASK 3 - countryLength = " + countryLength);

        String ocean = "Pacific";
        int oceanLength = ocean.length();
        System.out.println("TASK 3 - oceanLength = " + oceanLength);

        //Task create with your full name

        String myFullName = "Anthony Alexander Hermann";
        int myFullNameLength = myFullName.length();
        System.out.println("TASK 3 - myFullNameLength = " + myFullNameLength);

        // Create a string with the city you live

        String myCity = "Las Vegas Baby";
        int myCityLength = myCity.length();
        System.out.println("TASK 3 -myCityLength = " + myCityLength);
    }

}
