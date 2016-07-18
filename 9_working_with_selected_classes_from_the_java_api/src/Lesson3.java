/*
    9.3 Create and manipulate calendar data using classes from java.time.LocalDateTime,
    java.time.LocalDate, java.time.LocalTime, java.time.format.DateTimeFormatter,
    java.time.Period
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Lesson3 {
    /*
        Dates and times are immutable, like Strings, so when calling methods
        you need to ensure the return value is assigned.
     */
    public static void main(String[] args) {
        creatingDatesAndTimes();
        parsing();
        formatting();
        dateArithmetic();
    }

    public static void creatingDatesAndTimes() {
        /*
            Local dates/times are without timezone.
            - java.time.LocalDate
            - java.time.LocalTime
            - java.time.LocalDateTime
            These are created through static factory methods, not constructors.
            24-hour format without AM/PM is used by default.

            You don't need to know ZonedDateTime for OCAJP exam
        */
        int year = 2016;
        int month = 1; // 1 is January, not 0
        int day = 30;
        LocalDate date = LocalDate.of(year, month, day);
        // can also use provided constants
        date = LocalDate.of(year, Month.JANUARY,day);

        int hour = 11;
        int minute = 59;
        int second = 59;
        LocalTime time = LocalTime.of(hour, minute, second);

        /*
            LocalDateTime combines both LocalDate and LocalTime
         */
        LocalDateTime localDateTime = LocalDateTime.of(date,time);

        /*
            Current date and time
         */
        System.out.println("Now: " + LocalDateTime.now());
    }

    /*
        Parsing
        ISO format: yyyy-MM-ddThh:mm:ss
    */
    public static void parsing() {
        String dt = "2016-07-16T11:59:59";
        LocalDateTime pdt = LocalDateTime.parse(dt, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(pdt);
    }

    /*
        Formatting:
        DateTimeFormatter has constants you can use, or you can define your own
        format using ofPattern():
        yyyy or yy
        MM or M, MMMM, MMMMM
        dd or d , ddd is Exception
        hh or h
        mm or m
        ss or s
     */
    public static void formatting() {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        int year = 2016;
        int month = 1; // 1 is January, not 0
        int day = 30;
        LocalDate date = LocalDate.of(year, month, day);

        /*
            Two ways of formatting: using date class or format class
         */
        String dateString1 = date.format(dtf1);
        String dateString2 = dtf2.format(date);

        System.out.println("Dates: " + dateString1 + " " + dateString2);
    }

    /*
        Date arithmetic:
        Period only deals with years, months, weeks and days
        Duration deals with days and times.

        Be careful with some methods, because it is possible to
        add minutes to a date, or add weeks to a time, both of which will
        result in an exception.
    */
    public static void dateArithmetic() {
        Duration tenMinutes = Duration.ofMinutes(10);

        int hour = 11;
        int minute = 00;
        int second = 00;
        LocalTime time = LocalTime.of(hour, minute, second);

        LocalTime time2 = time.plusHours(2);
        System.out.println(time2);          // 13:00

        LocalTime time3 = time2.minus(tenMinutes);
        System.out.println(time3);          // 12:50

        /*
            runtime exception as using minutes with date
         */
        LocalDate date = LocalDate.of(2016,1,1);
        //date.plus(tenMinutes);

        /*
            Comparing dates and times
         */
        LocalDate date1 = LocalDate.of(2016, Month.JANUARY,01);
        LocalDate date2 = LocalDate.of(2016, Month.JANUARY,02);
        int result = date1.compareTo(date2);
        if(result == 1) {
            System.out.println("date1 is larger");
        }
        else if(result == -1) {
            System.out.println("date2 is larger");
        }
        else { // 0
            System.out.println("dates are equal");
        }

        Period period = Period.ofYears(1);
        period = Period.of(1,0,0); // alternatively

    }

}
