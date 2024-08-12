package je14_java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);
        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13,21,42);
        System.out.println(horaMinutoSegundoEspecifico);
        LocalTime horaMinutoEspecifico = LocalTime.of(13,21);
        System.out.println(horaMinutoEspecifico);
        LocalTime horaDeUmaString = LocalTime.parse("13:21:42");
        System.out.println(horaDeUmaString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter);
        System.out.println(horaDeUmaStringDespadronizada);

        System.out.println(horaAtual.getHour());
        System.out.println(horaAtual.getMinute());
    }
}
