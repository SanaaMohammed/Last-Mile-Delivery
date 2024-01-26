package oopproject;

public class Worker extends person{
	protected  float salary;
  	protected  String job;
	public Worker() {};
	public Worker(String name, int id, float salary, String job) {
		super(name, id);
		this.salary = salary;
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		if(salary>=0)
		this.salary = salary;
		else 
			System.out.println("In valid salary");
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

}
