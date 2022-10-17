package Week10.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class getLatestDate {
    public static LocalDate getDate(ArrayList<String> dates)
    {
        int days = 0;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM, yyy");
        LocalDate latestdate = LocalDate.now().minusYears(10000);
        for (String date : dates) {
           LocalDate parsed = LocalDate.parse(date,dateTimeFormatter);
          if(parsed.isAfter(latestdate))
          {
              latestdate = parsed;
          }
        }
        return latestdate;
    }

    public static void main(String[] args) {
        ArrayList<String> dates = new ArrayList<>(Arrays.asList("10 05, 2005",
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
                "13 08, 2036", //added
                "09 11, 2009"));
        System.out.println(getDate(dates));
    }
}
