package mudit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the format you want
        DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Format the date into a string
        String originalDateString = currentDate.format(originalFormat);

        System.out.println("Original Date String: " + originalDateString);

        // Define the new format you want
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse the original date string and format it with the new format
        LocalDate parsedDate = LocalDate.parse(originalDateString, originalFormat);
        String newDateString = parsedDate.format(newFormat);

        System.out.println("New Date String: " + newDateString);
    }
}
