package practice.Learning;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoughWork {

	public static void main(String[] args) {
		 String dateTimeString = "2024-04-02T12:13:54.083+00:00";
	        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString);
	        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
	        
	        String dateTimeString1 = "2024-04-02T12:13:54.656+00:00";
	        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(dateTimeString1);
	        LocalDateTime localDateTime1 = zonedDateTime1.toLocalDateTime();
	        
	        List<LocalDateTime> dateTime=new ArrayList<>();
	        dateTime.add(localDateTime);
	        dateTime.add(localDateTime1);
	        
	        List<LocalDateTime> a=dateTime.stream().sorted().collect(Collectors.toList());
	        System.out.println(a);

	}

}