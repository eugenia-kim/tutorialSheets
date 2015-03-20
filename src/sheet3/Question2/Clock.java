package sheet3.Question2;

public class Clock {
	
	protected int secondsSinceMid;

	private DisplayMode displayMode;
	
	public static final int HourToSec = 3600;
	
	public static final int MinToSec = 60;
	
	public Clock(int secondsSinceMid, DisplayMode displayMode) {
		this.secondsSinceMid = secondsSinceMid;
		this.displayMode = displayMode;
	}
	
	public Clock(int hh, int mm, int ss, DisplayMode displayMode) {
		secondsSinceMid = hh * HourToSec + mm * MinToSec + ss;
		this.displayMode = displayMode;
	}
	
	public void tick() {
		secondsSinceMid++;
		if(secondsSinceMid >= 24*HourToSec) {
			secondsSinceMid %= 24*HourToSec;
		}
	}
	
	@Override
	public String toString() {
		if(displayMode == DisplayMode.SecondsSinceMid) {
			return secondsSinceMid + " seconds since midnight." ;
		} else {
			return secondsSinceMid/HourToSec + ":" + (secondsSinceMid%HourToSec)/MinToSec + ":" + (secondsSinceMid%HourToSec)%MinToSec;
		}
		
	}

	public int getTime() {
		return secondsSinceMid;
	}
	
}
