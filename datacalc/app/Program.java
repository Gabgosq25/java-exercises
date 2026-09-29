package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-09-19");
        LocalDateTime d05 = LocalDateTime.parse("2026-09-19T15:30:00");
        Instant d06 = Instant.parse("2026-09-19T15:30:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate plusyearLocalDate = d04.plusYears(1);

        System.out.println("Past week LocalDate: " + pastWeekLocalDate);
        System.out.println("Next week LocalDate: " + nextWeekLocalDate);
        System.out.println("Plus one year LocalDate: " + plusyearLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("Past week LocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("Next week LocalDateTime:" + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
        System.out.println("t4 dias: " + t4.toDays());

    }
}