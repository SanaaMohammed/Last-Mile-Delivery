package oopproject;

public class Student extends person{
	private  int courses;
	 private Date date;
	
	 public Student() {}
	
	Date da=new Date();
	
	public Student(person i) {
	
	}

	public Student(String name, int id,  int courses) {
		super(name,id);
		this.courses = courses;
	}

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return String.format("- The Student Name is : %s \n- The Student ID is :  %d   \n- The Student Number of Course is :  %d  ",name,id,courses);
	}
	public String print () {
		return da.toString();
		
	}
		
	
}
