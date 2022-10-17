package Day47.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDateTimemanipulation {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Now "+today);
        LocalDate days3ago = today.plusDays(-3);
        System.out.println(days3ago);
        LocalDate day3after = today.plusDays(+3);
        LocalDate week3after = today.plusWeeks(4);
        System.out.println(week3after);
        days3ago = today.minusYears(-3).plusWeeks(3);
        System.out.println(days3ago);


        LocalTime timenow = LocalTime.now();
        timenow =timenow.plusHours(4);

        LocalDateTime dateTimenow = LocalDateTime.now();
        dateTimenow = dateTimenow.plusYears(3).plusHours(4);

        dateTimenow = dateTimenow.minusHours(timenow.getHour());

    }
}
