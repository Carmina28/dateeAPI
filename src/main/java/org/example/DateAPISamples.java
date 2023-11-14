package org.example;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAPISamples {

    public static void main(String[] args) {
        System.out.println("The new API is more comprehensive, flexible, and designed to handle the complexities of date and time representation " +
                "\nin a more intuitive way.\n");
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println("\nWithout date");
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        System.out.println("\nDate and time");
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        System.out.println("\nZone");
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);

        System.out.println("\nInstant");
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println("\nPeriod of Time");
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 1);
        Period period = Period.between(startDate, endDate);
        System.out.println(period);

        System.out.println("\nDuration");
        LocalTime startTime = LocalTime.of(12, 0, 0);
        LocalTime endTime = LocalTime.of(13, 30, 0);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println(duration);

        System.out.println("\nDateTimeFormatter");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDateTime = dateTime.format(formatter);

        System.out.println(formattedDateTime);

    }
}
