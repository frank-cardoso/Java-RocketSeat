package je14_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.of(19,17,21);
        esperaDataHora(localDate.atTime(localTime));
    }
    static void esperaDataHora(LocalDateTime data) {

    }
}
