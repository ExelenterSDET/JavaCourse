package Day49.SaturdayProject.Ibrahim.Task3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class LatestDate {
    public static LocalDate getLatestDate(ArrayList<String> listOfDates){
        LocalDate latestDate = LocalDate.of(0, 1, 1);


        for(String date : listOfDates){
            String reviewedDate = date.replaceAll("[^\\d]", "");
            LocalDate parse = LocalDate.parse(reviewedDate, DateTimeFormatter.ofPattern("ddMMyyy"));
            latestDate = latestDate.isAfter(parse) ? latestDate : parse;
        }

        return latestDate;
    }

    public static void main(String[] args) {
        ArrayList<String> listOfDates = new ArrayList<>(Arrays.asList(
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
                "09 11, 2009"));

        LocalDate latestDate = getLatestDate(listOfDates);
        System.out.println("latestDate = " + latestDate);
    }
}
