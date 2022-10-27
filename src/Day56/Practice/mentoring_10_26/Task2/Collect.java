package Day56.Practice.mentoring_10_26.Task2;

import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args) {

        Stream<Account> streamList = Stream.of(new Account("Checking", "New York", 001, 350),
                                               new Account("Checking", "New York", 002, 450),
                                               new Account("Checking", "New York", 003, 200),
                                               new Account("Saving", "New Jersey", 004, 700));

        streamList.forEach(eachStream -> System.out.println(eachStream));


    }
}
