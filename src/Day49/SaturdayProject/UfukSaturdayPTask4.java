package Day49.SaturdayProject;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/*
Task 4
    Create a method to convert date.
    Return type = String
    Parameter = String

    Parameter String are in the following format:
    "15th Oct 2022"

    Note: all months are as follow:
    "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"

    Examples:
    Input: date = "20th Oct 2052"
    Output: "2052-10-20"
 */
public class UfukSaturdayPTask4 {
    public static void main(String[] args) {
        String dateInString = "20th Oct 2052";
        System.out.println("date = " + dateInString);
        convertDate(dateInString);
    }

    public static String convertDate(String strDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'th' MMM yyy");
        LocalDate dateTime = LocalDate.parse(strDate, formatter);
        String datem=dateTime.toString();
        System.out.println(datem);
        return datem;
    }
}
