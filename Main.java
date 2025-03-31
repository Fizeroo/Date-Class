import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            // Create valid and invalid Date objects
            Date date1 = new Date(15, 8, 2023);
            Date date2 = new Date(1, 1, 2020);
            Date date3 = new Date(29, 2, 2020); // Leap year
            // Date invalidDate = new Date(30, 2, 2021); // Invalid date

            // Print dates
            System.out.println("Date 1: " + date1);
            System.out.println("Date 2: " + date2);
            System.out.println("Date 3: " + date3);

            // Update a date
            date1.updateDate(20, 8, 2023);
            System.out.println("Updated Date 1: " + date1);

            // Print the day of the week
            System.out.println("Day of Week for Date 1: " + date1.getDayOfWeek());

            // Calculate the difference between two dates
            int difference = date1.calculateDifference(date2);
            System.out.println("Difference between Date 1 and Date 2: " + difference + " days");

            // Sort a list of dates
            ArrayList<Date> dates = new ArrayList<>();
            dates.add(date1);
            dates.add(date2);
            dates.add(date3);

            System.out.println("\nBefore Sorting:");
            for (Date date : dates) {
                System.out.println(date);
            }

            Collections.sort(dates);

            System.out.println("\nAfter Sorting:");
            for (Date date : dates) {
                System.out.println(date);
            }

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}