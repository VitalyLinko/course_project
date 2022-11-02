package util;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateInput {
    static int year;
    static int month;
    static int day;
    static LocalDate dateOfReturn;

    public static LocalDate userDateCreator() {
        System.out.println("Enter the date of completion");
        while (true) {
            System.out.print("Enter year. ");
            year = UserChoiceInput.getUserChoiceInput();
            System.out.print("Enter month. ");
            month = UserChoiceInput.getUserChoiceInput();
            System.out.print("Enter day. ");
            day = UserChoiceInput.getUserChoiceInput();
            try {
                dateOfReturn = LocalDate.of(year, month, day);
                LocalDate localDateToday = LocalDate.now();
                if (dateOfReturn.isAfter(localDateToday)) {
                    return dateOfReturn;
                }else {
                    System.out.println("Invalid input. Your data is before current date.");
                }
            } catch (DateTimeException e) {
                System.out.println("Invalid input.");
            }
        }
    }
}
