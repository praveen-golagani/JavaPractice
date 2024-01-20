package interfacepolymorphism;

import java.time.LocalDateTime;

public class Clock implements Alarm{

	public void showTime() {
		System.out.println("it is "+LocalDateTime.now());
	}
	
	public void setAlarm() {
		System.out.println("Clock Setting alarm @7:30");
	}
}
