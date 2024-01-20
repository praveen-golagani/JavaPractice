package interfacepolymorphism;

public class IPhone implements Alarm{

	public void dail() {
	System.out.println("Calling 123");	
	}
	
	public void answerCall() {
		System.out.println("Hello");
	}
	
	public void setAlarm() {
		System.out.println("I phone Setting alarm @7:30");
	}
}
