package Day50.Practice.Dilnoza;

import java.time.LocalDate;
import java.time.Month;
public class OCATask {
//    Which of the following can be inserted into the blank to create a date of June 21, 2014?
//    (Choose all that apply)

    public static void main(String[] args) {
            LocalDate date = LocalDate.of(2014, Month.JUNE, 21);
            System.out.println("date = " + date);
        }
    }
//A. new LocalDate(2014, 5, 21);
//B. new LocalDate(2014, 6, 21);
//C. LocalDate.of(2014, 5, 21);
//D. LocalDate.of(2014, 6, 21);
//E. LocalDate.of(2014, Calendar.JUNE, 21);

