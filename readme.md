Project: Implementing a Date Class in Java
Objective
This project demonstrates the implementation of a Date class in Java to represent dates and perform various operations such as validation, updating, calculating differences, sorting, and formatting dates for readability.

Features of the Date Class
Attributes :
day: Day of the month (int).
month: Month of the year (int).
year: Year (int).
Methods :
Validation :
isValidDate(): Validates whether the date is within reasonable ranges, including leap year checks for February 29.
Updating :
updateDate(int d, int m, int y): Updates the date after validating the new values.
Day of the Week :
getDayOfWeek(): Returns the day of the week (e.g., "Monday") for the given date.
Difference Calculation :
calculateDifference(Date otherDate): Computes the difference in days between two Date objects, accounting for leap years.
Readable Format :
printDate(): Prints the date in a readable format (e.g., "January 1, 2023").
Sorting :
Implements Comparable<Date> to enable sorting of Date objects in ascending order (first by year, then by month, and finally by day).
Demonstration in Main Class
The Main class showcases the functionality of the Date class:

Create and Validate Dates :
Creates valid and invalid Date objects.
Handles invalid dates with an exception (IllegalArgumentException).
Update a Date :
Demonstrates updating a Date object with new values.
Print the Day of the Week :
Displays the day of the week for a given date.
Calculate the Difference Between Two Dates :
Computes and prints the difference in days between two Date objects.
Sort a List of Dates :
Sorts an ArrayList<Date> in ascending order using Collections.sort().

SAmple output
Date 1: August 15, 2023
Date 2: January 1, 2020
Date 3: February 29, 2020
Updated Date 1: August 20, 2023
Day of Week for Date 1: Sunday
Difference between Date 1 and Date 2: 1327 days

Before Sorting:
August 20, 2023
January 1, 2020
February 29, 2020

After Sorting:
January 1, 2020
February 29, 2020
August 20, 2023
