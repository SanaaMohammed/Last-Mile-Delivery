package oopproject;

public class technicians extends Worker{
	 private int num_hours;
	public technicians() {}
	public technicians(String name, int id, float salary, String job, int num_hours) {
		super(name, id, salary, job);
		this.num_hours = num_hours;
	}

	public int getNum_hours() {
		return num_hours;
	}

	public void setNum_hours(int num_hours) {
		this.num_hours = num_hours;
	}

	@Override
	public String toString() {
		return String.format("The technicians Name is : %s\nThe technicians ID is : %d\nThe technicians Job is : %s\nthe technicians Salary = %.06f\nthe Number hours is : %d", name,id,job, salary,num_hours);
	}
	

}
