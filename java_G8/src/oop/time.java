package oop;

public class time {
     int hour,minute,second;

	public time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
		
	}
	public time nextSecond() {
		time time = new time(hour,minute,second);
		if(second<59) {
			second ++;
		}else {
			time.second = 0;
			if (time.minute<59)
				time.minute ++;
			else 
				time.hour = 0;
		}
		return time;
	}
    
	
	
}
