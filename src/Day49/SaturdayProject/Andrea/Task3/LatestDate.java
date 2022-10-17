package Day49.SaturdayProject.Andrea.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class LatestDate {
    public static void main(String[] args) {
        ArrayList<String> dateList = new ArrayList<>(Arrays.asList(
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
       ));
        System.out.println(getLatestDate(dateList));
    }
    static LocalDate getLatestDate(ArrayList<String> list){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM, yyy");
        LocalDate latestDate = LocalDate.of(0,1,1);
        formatter.format(latestDate);
        for (String s : list) {
            LocalDate date = LocalDate.parse(s, formatter);
            if(date.isAfter(latestDate)){
                latestDate = date;
            }
        }
        return latestDate;
    }
}
