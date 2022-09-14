package Day26.Practice._09_14_2022_Mentoring_SP5;

public class sP5_Task6 {

        /*
    Task 6

Create a method whose name is populationOfCountry
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

    int populationOfCountry(String [] countries, int [] population, String countryName){
        int countryPopulation = -1;

        for (int i = 0; i < countries.length; i++) {
            if (countryName.equals(countries[i])){
                countryPopulation = population[i];
                break;
            }
//            countryPopulation = countryName.equals(countries[i]) ? population[i] : -1;
        }
        
        return countryPopulation;
    }

    public static void main(String[] args) {
        String [] countryNames = {"USA" ,"Mexico" ,"Canada"}; // first iteration true; second iter. -1; third iter. -1
        int [] countryPopulations = {100000 , 120000 , 130000};
        String country = "Mexico";

        sP5_Task6 t6 = new sP5_Task6();
        System.out.println(t6.populationOfCountry(countryNames, countryPopulations, country));
    }
}
