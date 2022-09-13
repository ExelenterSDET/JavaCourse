package Day24.Practice.Tohir_Week5;

public class Assignment_6 {

    public static void main(String[] args) {
        Assignment_6 asg = new Assignment_6();
     String[] countryNames = {"USA" ,"Mexico" ,"Canada"};
     int[] countryPopulations = {100000 , 120000 , 130000};
     String country = "Canada";
        System.out.println(" = " + asg.populationOfCountry(countryNames,countryPopulations,country));
    }
    int populationOfCountry(String[] str, int [] num, String str1)
    {
        int index = -1;
        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(str1))
            {
               index = num[i];
               break;
            }else
            {
                index = -1;
            }

        }
        return index;
    }
}
//Task 6
//
//Create a method whose name is populationOfCountry
//   As parameters it takes a String array, an int array and a String (in order)
//       First parameter (String array) is a non-empty array of 'country names'
//       Second parameter (int array) is a non-empty array of 'country population' of the corresponding country
//       (i.e. sharing the same index, so the length of the two parameter arrays are the same)
//       Third parameter (String) is the name of a country
//   The method returns an int
//   If the name of the country is in the country names array then the method returns the population of that country.
//   If not, the method return -1
//   Sample - 1:
//        countryNames = {"USA" ,"Mexico" ,"Canada"}
//        countryPopulations = {100000 , 120000 , 130000}
//        country = "Mexico"
//        method returns 120000
//   Sample - 2:
//        countryNames = {"USA" ,"Mexico" ,"Canada"}
//        countryPopulations = {100000 , 120000 , 130000}
//        country = "Russia"
//        method returns -1