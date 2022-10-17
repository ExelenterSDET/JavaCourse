package Day49.SaturdayProject.Andrea.Task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {

    public static void main(String[] args) {
        String dateToConvert1 = "20th Oct 2052";
        String dateToConvert2 = "6th Jun 1933";
        String dateToConvert3 = "26th May 1960";

        System.out.println(convertDate(dateToConvert1));
        System.out.println(convertDate(dateToConvert2));
        System.out.println(convertDate(dateToConvert3));
    }

    public static String convertDate(String str){
        String dateStr = str .replaceAll("(?<=\\d)(st|nd|rd|th)", "");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        return date.toString();
    }
}
