package docs.java.cheatsheets.test02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeExample {

    public void showDateTime() {

        // Aktuelles Datum
        LocalDate date = LocalDate.now(); // 2025-04-22

        // Aktuelles Datum
        LocalTime time = LocalTime.now();

        // Aktuelles Datum mit Uhrzeit
        LocalDateTime dateTime = LocalDateTime.now();// 22.04.2025 10:42:54

        // Format Datum und Uhrzeit
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Heutiges Datum: " + date);
        System.out.println("Aktuelle Zeit: " + time);
        System.out.println("Formatierter Timestamp: " + dateTime.format(formatter));

        // Wochentag ausgeben
        System.out.println(dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL,
                Locale.GERMAN));
    }
}
