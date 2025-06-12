package Practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalenderPractice {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
        //      System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[1]);
    }
}
