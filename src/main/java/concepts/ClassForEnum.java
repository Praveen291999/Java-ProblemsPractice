package concepts;

public class ClassForEnum {
	public static void main(String[] args) {
		DayEnum today =DayEnum.SATURDAY;
		
		if(today.isWeekend()) {
			System.out.println("WeekEnd");
		}else {
			System.out.println("Not a WeekEnd");
		}
	}

}
