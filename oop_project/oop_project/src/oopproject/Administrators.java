package oopproject;

public class Administrators extends Worker{
	 private String depart;
		public Administrators() {}
	public Administrators(String name, int id, float salary, String job,String depart) {
			super(name, id, salary, job);
			this.depart=depart;
		}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return String.format("The Administrators Name is : %s\nThe Administrators ID is : %d\nThe Administrators Job is : %s\nthe Administrators Salary = %.06f\nthe department is : %s", name,id,job, salary,depart);

	}

}
