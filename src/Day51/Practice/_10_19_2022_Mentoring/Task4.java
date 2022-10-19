package Day51.Practice._10_19_2022_Mentoring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {

    public static String convertDate(String str){
// "(?<=\\d)(st|nd|rd|th)", ""

        str = str.replaceAll("(?<=\\d)(st|nd|rd|th)", "");
        LocalDate parsedDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd MMM yyy"));
        return parsedDate.toString();
    }

    public static void main(String[] args) {
        String date1 = "01st Oct 2018";
        String date2 = "02nd Oct 2018";
        String date3 = "03rd Oct 2018";
        String date4 = "11th Oct 2018";

        System.out.println(convertDate(date1));
        System.out.println(convertDate(date2));
        System.out.println(convertDate(date3));
        System.out.println(convertDate(date4));

    }
}
