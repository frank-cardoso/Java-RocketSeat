package je14_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate  datateste = LocalDate.of(2024,2,25);

        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");


        System.out.println(datateste);

        System.out.println(dataFormatter.format(datateste));
    }
}

