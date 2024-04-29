package practice;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Example {
    public static void main(String[] args) throws Exception {
        String userInput = "JAN";
        List<String> violationMessages = new ArrayList<>();

        validateMonthYear(userInput, violationMessages);
        
        if (!violationMessages.isEmpty()) {
           throw new Exception(violationMessages.toString());
        }
    }

    private static void validateMonthYear(String input, List<String> violationMessages) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM");

  
        if (Objects.nonNull(input)) {
        	 ParsePosition pos = new ParsePosition(0);

             // Attempt to parse the useMonth with the "MMM" format
             Date parsedDate = dateFormat.parse(input, pos);
            if (parsedDate != null && pos.getIndex() == input.length()) {
                // Valid MMM format
            } else {
                violationMessages.add("Invalid");
            } 	
        } else {
            violationMessages.add("Null");
        }
    }
}
