package a_CodeJAVA.a1011_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // Local Date
        System.out.println(date);

        LocalTime time = LocalTime.now();  // Local Time
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now(); //Local Date and Time
        System.out.println(dateTime);

        Instant instant = Instant.now();  // UTC timestamp (Military Time)
        System.out.println(instant);

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dt.format(formatter);
        System.out.println(newDateTime);

        LocalDate date1 = LocalDate.of(2024,12,25);
        System.out.println(date1);

        LocalDateTime date2 = LocalDateTime.of(2025,2,5, 10,3,5);
        System.out.println(date2);

        if(date2.isBefore(dt)){
            System.out.println("TRUE!");
            System.out.println(date2 + " is Before " + dt);

        }else {
            System.out.println("FALSE!");
            System.out.println(dt + " is Before " + date2);

        }



    }
}
