package Day49.SaturdayProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/*Task 3
        Create a method named as getLatestDate.
        Method returns LocalDate and has a parameter a List of Strings
        -- List of Strings has dates in "dd MM, yyy" format.
        -- return the latest Date.

        Example:
        List is as follow:

        "10 05, 2005",
        "08 03, 2015",
        "12 04, 1900",
        "09 11, 1850",
        "03 02, 2022",
        "24 02, 2020",
        "22 03, 1988",
        "19 10, 1999",
        "17 09, 2001",
        "22 05, 2022",
        "10 01, 2011",
        "29 04, 1999",
        "13 08, 2006",
        "09 11, 2009"

        Output should be: 2022-05-22
*/

public class UfukSaturdayPTask3 {
    public static void main(String[] args) {

        ArrayList<String> dateList = new ArrayList<>(Arrays.asList( "10 05, 2005", "08 03, 2015","12 04, 1900","09 11, 1850",
                "03 02, 2022","24 02, 2020","22 03, 1988","19 10, 1999","17 09, 2001","22 05, 2022", "10 01, 2011","29 04, 1999",
                "13 08, 2006","09 11, 2009"));
        System.out.println(getLatestDate(dateList));
    }

    public static LocalDate getLatestDate(ArrayList<String> dateList){
        LocalDate lastday=LocalDate.of(0,1,1);
        for (int i = 0; i < dateList.size(); i++) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM, yyy");
            LocalDate date1=LocalDate.parse( dateList.get(i),formatter);
            if(date1.isAfter(lastday)){
                lastday=date1;
            }
        }
        return lastday;
    }
}
