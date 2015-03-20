package sheet3.Question2;

public class AlarmClock extends Clock {
	
	private boolean isBeeping;
	
	private int alarmTime;

	public AlarmClock(int secondsSinceMid, DisplayMode displayMode, int alarmTime) {
		super(secondsSinceMid, displayMode);
		this.alarmTime = alarmTime;
		this.isBeeping = false;
	}
	
	public AlarmClock(int hh, int mm, int ss, DisplayMode displayMode, int ah, int am, int as) {
		super(hh, mm, ss, displayMode);
		this.isBeeping = false;
		alarmTime = ah * HourToSec + am * MinToSec + as;
	}
	
	@Override
	public void tick() {
		super.tick();
		if(secondsSinceMid >= alarmTime) {
			isBeeping = true;
		} else if(secondsSinceMid >= (alarmTime + 60)%(24*Clock.HourToSec)) {
			isBeeping = false;
		}
	}
	
	@Override
	public String toString() {
		if(isBeeping) {
			return super.toString() + " BEEP!";
		} else {
			return super.toString();
		}
	}
	
	
}
