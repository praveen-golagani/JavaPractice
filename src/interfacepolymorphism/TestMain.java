package interfacepolymorphism;

public class TestMain {

	public static void main(String[] args) {
		// to abstract and interface we cannot create object
			GoogleMini g = new GoogleMini();
			IPhone ip = new IPhone();
			Clock c = new Clock();
			alarmTest(ip);
			alarmTest(c); 
			alarmTest(g);
			
	}

	private static void alarmTest(Alarm ip) {
		ip.setAlarm();
	}
}
