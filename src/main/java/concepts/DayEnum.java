package concepts;

public enum DayEnum {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	//MONDAY("monday"), TUESDAY("monday"), WEDNESDAY("monday"), THURSDAY("monday"), FRIDAY("monday"), SATURDAY("monday"), SUNDAY("monday");

	//Custom methods
	public boolean isWeekend() {
		return this == SATURDAY || this == SUNDAY;

	}

}
