package Day49.SaturdayProject.Sebahattin.Task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskDate {
    public static void main(String[] args) {
        String str = "15th 11 2022";
        System.out.println(" "+str+" => " +convertDate(str));
    }
        public static String convertDate(String str){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd'th' MM yyyy");
            LocalDate parseDate = LocalDate.parse(str, dateTimeFormatter);
            String returnStr = parseDate.toString();
            return returnStr;

        }
}
