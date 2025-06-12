package Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime DateAndTime = LocalDateTime.now();
     //   System.out.println(DateAndTime);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/mm/yyyy--E  H:m a");
        DateTimeFormatter dt2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(DateAndTime.format(dt2));
    }
}
