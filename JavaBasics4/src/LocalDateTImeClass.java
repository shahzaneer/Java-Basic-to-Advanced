import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatterBuilder;

public class LocalDateTImeClass {
    public static void main(String[] args) {

//----------------------Advantages of reading official Documentation-----------------------------------------
//In nov 2020 these methods were instance methods! the video lecture also contains the same way to use the class
//        but after going through the documentation of java I came to know that these methods are now static.

//        LocalTime time = new LocalTime.now();
//        System.out.println(time);
//        LocalDate date = new LocalDate.now();
//        System.out.println(date);


//    how to print local date
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println();

//how to get elements of date
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println();

//        how to get elements of time
        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalTime.now().getSecond());
        System.out.println();

//how to format the date (See official docs of java @ docs.oracle.com)

    }
}
