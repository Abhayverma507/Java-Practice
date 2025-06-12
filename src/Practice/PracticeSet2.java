package Practice;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PracticeSet2 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        LocalDateTime DateAndTime = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(DateAndTime.format(dt));

    }
}
