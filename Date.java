import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) throws IllegalArgumentException {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Check if the date is valid
    public boolean isValidDate() {
        return isValidDate(this.day, this.month, this.year);
    }

    private boolean isValidDate(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1) return false;

        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        return day <= maxDay;
    }

    // Update the date
    public void updateDate(int d, int m, int y) {
        if (!isValidDate(d, m, y)) {
            throw new IllegalArgumentException("Invalid date: " + d + "/" + m + "/" + y);
        }
        this.day = d;
        this.month = m;
        this.year = y;
    }

    // Get the day of the week
    public String getDayOfWeek() {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[dayOfWeek - 1];
    }

    // Calculate the difference in days between two dates
    public int calculateDifference(Date otherDate) {
        Calendar thisCal = new GregorianCalendar(this.year, this.month - 1, this.day);
        Calendar otherCal = new GregorianCalendar(otherDate.year, otherDate.month - 1, otherDate.day);

        long diffInMillis = thisCal.getTimeInMillis() - otherCal.getTimeInMillis();
        return (int) (diffInMillis / (1000 * 60 * 60 * 24));
    }

    // Print the date in a readable format
    public void printDate() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.println(months[this.month - 1] + " " + this.day + ", " + this.year);
    }

    // Compare two dates for sorting
    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        } else if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        } else {
            return Integer.compare(this.day, other.day);
        }
    }

    // Override toString for better representation
    @Override
    public String toString() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[this.month - 1] + " " + this.day + ", " + this.year;
    }
}