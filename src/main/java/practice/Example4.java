package practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Example4 {
	
	public static void main(String[] args) throws Exception {
        String userInput = "5";
        List<String> violationMessages = new ArrayList<>();

        validateMonthYear(userInput, violationMessages);
        
        if (!violationMessages.isEmpty()) {
           throw new Exception(violationMessages.toString());
        }
        
    }

	private static void validateMonthYear(String userInput, List<String> violationMessages) {
		if(!userInput.matches("^(2|3|4|6|8|9|10|12)$")) {
			
			violationMessages.add("Invalid");
		}
		
	}

}
