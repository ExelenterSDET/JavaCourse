package Week10.Task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertDate {
    public static String ConvertedDate(String date)
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd'th' MMM yyy");
        LocalDate insertedDate = LocalDate.parse(date,dateTimeFormatter);
        DateTimeFormatter newdateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String converted = "".concat(insertedDate.format(newdateTimeFormatter).toString());
        return converted;
    }

    public static void main(String[] args) {
        System.out.println(ConvertedDate("15th Oct 2020"));
        System.out.println(ConvertedDate("25th Nov 20120"));

    }
}
