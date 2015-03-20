package sheet3.Question2;

public class AlarmClockDemo {

	public static void main(String[] args) throws InterruptedException {
		
		AlarmClock clock = new AlarmClock(23, 59, 50, DisplayMode.HMS, 23, 59, 58);
		
		while(true) {
			System.out.println("Clock shows : " + clock);
			Thread.sleep(1000);
			clock.tick();
			if(clock.getTime() == 120) {
				return;
			}
		}
	}

}
