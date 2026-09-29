package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
import java.util.Calendar;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2026-09-20T02:10:00Z"));

        System.out.println("Date: " + sdf.format(d));

        Calendar cal = Calendar.getInstance();
        int minutes = cal.get(Calendar.MINUTE);
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        int seconds = cal.get(Calendar.SECOND);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        System.out.println("Date after adding 4 hours: " + sdf.format(d));
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Seconds: " + seconds);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

    }
}