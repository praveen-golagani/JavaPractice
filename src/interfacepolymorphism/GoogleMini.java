package interfacepolymorphism;

public class GoogleMini implements Alarm {

	public void ask() {
		System.out.println("How's the weather today");
	}
	
	public void setAlarm() {
		System.out.println("GMini Setting alarm @7:30");
	}
}
