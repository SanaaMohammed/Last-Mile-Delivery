package oopproject;

public class Date {
	   private int sec;
	   private int min;
	   private int hours;
	public Date(int sec, int min, int hours) {

		this.sec = sec;
		this.min = min;
		this.hours = hours;
	}
	public Date() {}
 

	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		
		return String.format("%d / %d / %d\n ", sec,min,hours);
	}
	
	
}
