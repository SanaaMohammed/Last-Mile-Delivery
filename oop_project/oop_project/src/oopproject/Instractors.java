package oopproject;

public class Instractors extends Worker{
	 private String  course;
	public Instractors() {}
	public Instractors(String name, int id, float salary, String job, String course) {
		super(name, id, salary, job);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return String.format("The Instractors Name is : %s\nThe Instractors ID is : %d\nThe Instractors Job is : %s\nthe Instractors Salary = %.06f\nthe Course is : %s", name,id,job, salary,course);
	}


}
