package Day49.SaturdayProject.Sebahattin.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> listDate = new ArrayList<>(Arrays.asList(
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

        System.out.println(getLatestDate(listDate));

    }
    public static LocalDate getLatestDate(ArrayList<String> listDate){
        LocalDate endDate = LocalDate.of(0,1,1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM, yyy");
        for (int i = 0; i < listDate.size(); i++) {
            LocalDate date1 = LocalDate.parse(listDate.get(i),dateTimeFormatter);
            if (date1.isAfter(endDate)){
                endDate = date1;
            }
        }
    return endDate;

    }
}
