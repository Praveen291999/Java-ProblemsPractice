package practice;

import java.util.regex.Pattern;
public class UuidCheck {

    public static void main(String[] args) {
        String input = "a57fea9c-651a-4f97-8c61-8a5af08354e6"; // Replace this with your input

        if (isValidUUID(input)) {
            System.out.println("Valid UUID");
        } else {
            System.out.println("Not a valid UUID");
        }
    }

    public static boolean isValidUUID(String input) {
        // Regular expression pattern for UUID validation
        String regexPattern = 
            "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
        Pattern pattern = Pattern.compile(regexPattern);

        //Checking match
        return pattern.matcher(input).matches();
    }
}