package Day6.Java.JStrings;

public class StringLength {
    public static void main(String[] args) {
        // Length method return number of character in the string
        String country = "United States of America";  // alt + enter
        int countryLength = country.length();
        System.out.println("countryLength = " + countryLength);
        String ocean = "Pacific";
        int oceanLength = ocean.length();
        System.out.println("oceanLength = " + oceanLength);

        // create a string with your full name. and get the length of your full name.
        String furkat = "Furkat Ali Khalilov";
        int myNameLength = furkat.length();
        System.out.println(myNameLength);

        // create a string with the city you
        // live and count the length of characters of your city`s name

        String city = "Brooklyn";
        int cityLength = city.length();
        System.out.println("cityLength = " + cityLength);


    }
}
