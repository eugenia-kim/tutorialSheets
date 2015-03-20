package sheet3.Question2;

public class ClockDemo {

	public static void main(String[] args) throws InterruptedException {
		Clock clock1 = new Clock(0, DisplayMode.SecondsSinceMid);

		Clock clock2 = new Clock(23, 59, 53, DisplayMode.HMS);

		while(true) {
			System.out.println("Clock 1 shows : " + clock1 + ". Clock 2 shows : " + clock2);
			Thread.sleep(1000);
			clock1.tick();
			clock2.tick();
			if(clock1.getTime() == 10) {
				return;
			}
		}
	}

}
