package datacrating;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateInput {
    static int year;
    static int month;
    static int day;
    static LocalDate dateOfReturn;

    public static LocalDate userDateCreator() {
        while (true) {
            System.out.print("Enter year. ");
            year = UserChoiceInput.getUserChoiceInput();
            System.out.print("Enter month. ");
            month = UserChoiceInput.getUserChoiceInput();
            System.out.print("Enter day. ");
            day = UserChoiceInput.getUserChoiceInput();
            try {
                dateOfReturn = LocalDate.of(year, month, day);
                return dateOfReturn;


            } catch (DateTimeException e) {
                System.out.println("Invalid input.");
            }
        }
    }
}
