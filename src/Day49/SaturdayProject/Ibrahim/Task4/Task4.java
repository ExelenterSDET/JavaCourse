package Day49.SaturdayProject.Ibrahim.Task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task4 {
    public static String convertDate(String date){

        String dateStr = date.replaceAll("(?<=\\d)(st|nd|rd|th)", "");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyy");
        LocalDate date1 = LocalDate.parse(dateStr, formatter);

        return date1.toString();
    }

    public static void main(String[] args) {
        String date = "20th Oct 2052";
        String date1 = "6th Jun 1933";
        String date2 = "26th May 1960";
        String convertedDate = convertDate(date);
        String convertedDate1 = convertDate(date1);
        String convertedDate2 = convertDate(date2);
        System.out.println("localDate = " + convertedDate);
        System.out.println("localDate = " + convertedDate1);
        System.out.println("localDate = " + convertedDate2);

    }
}
