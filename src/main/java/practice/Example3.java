package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        String inputYear = "0123";

        if (isValidYearFormat(inputYear)) {
            System.out.println(inputYear + " is a valid YYYY year format.");
        } else {
            System.out.println(inputYear + " is not a valid YYYY year format.");
        }
    }

    private static boolean isValidYearFormat(String year) {
        if (year == null || year.length() != 4) {
            return false;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        try {
            // Parse the input year with the specified format
            dateFormat.parse(year);
            return true; // If parsing is successful, it's a valid year format
        } catch (ParseException e) {
            return false; // Parsing failed, not a valid year format
        }
    }
}