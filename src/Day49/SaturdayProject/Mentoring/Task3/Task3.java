package Day49.SaturdayProject.Mentoring.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

public static LocalDate getLatestDate(ArrayList<String> list){
    LocalDate result = LocalDate.MIN;
    for (String s : list) {
        LocalDate parsedDate =
                LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MM, yyy"));
        result = result.isAfter(parsedDate) ? result : parsedDate;
    }
    return result;
}

    public static void main(String[] args) {
        ArrayList<String> dates = new ArrayList<>(Arrays.asList(

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
        System.out.println(getLatestDate(dates));
    }
}
