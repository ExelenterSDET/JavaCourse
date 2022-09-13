package Day24.Practice.Sebahattin;

public class Task06 {
    public static void main(String[] args) {
    /*     Create a method whose name is populationOfCountry
       As parameters it takes a String array, an int array and a String (in order)
           First parameter (String array) is a non-empty array of 'country names'
           Second parameter (int array) is a non-empty array of 'country population' of the corresponding country
           (i.e. sharing the same index, so the length of the two parameter arrays are the same)
           Third parameter (String) is the name of a country
       The method returns an int
       If the name of the country is in the country names array then the method returns the population of that country.
       If not, the method return -1
       Sample - 1:
            countryNames = {"USA" ,"Mexico" ,"Canada"}
            countryPopulations = {100000 , 120000 , 130000}
            country = "Mexico"
            method returns 120000
       Sample - 2:
            countryNames = {"USA" ,"Mexico" ,"Canada"}
            countryPopulations = {100000 , 120000 , 130000}
            country = "Russia"
            method returns -1
*/
        String[] countryNames = {"USA", "Mexico", "Canada"};
        int[] countryPopulations = {100000, 120000, 130000};
        String country = "Canada";
        System.out.println(populationOfCountry(countryNames, countryPopulations, country));
    }
    static int populationOfCountry(String[] nameArr, int[] popArr, String name) {
        int result = 0;

        for (int i = 0; i < nameArr.length; i++) {

            if( nameArr[i].equals(name)){
                result = popArr[i];
                break;
            }else {
                result = -1;
            }
        }
        return result;
    }
}
