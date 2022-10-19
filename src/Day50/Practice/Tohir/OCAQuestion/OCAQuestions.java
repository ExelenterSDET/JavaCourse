package Day50.OCAQuestion;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;//Under util package

public class OCAQuestions {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.AUGUST,3);
        date.plusDays(40);
        date.plusMonths(3);

        System.out.println(date.getYear()+" "+date.getMonth()+" "+date.getDayOfMonth());
        LocalDate date1 = LocalDate.of(3020, Calendar.APRIL,4);
        System.out.println(date1);
    }
}
