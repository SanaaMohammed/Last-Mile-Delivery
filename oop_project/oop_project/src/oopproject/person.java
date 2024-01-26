package oopproject;

import java.util.Scanner;

public class person implements ShowData {

	protected String name;
	protected int id;
	
	
	public boolean equals ( Object o )
	{
		person p = (person) o;
		
		if	(id == p.id)
		{
			return true;
		}
		else
			return false;
		
	}
	static Scanner input = new Scanner(System.in);

	public person() {
	}

	public person(person i) {

	}

	public person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//
	// public void toString() {}

	@Override
	public void printData() {
	 System.out.print(toString());
		
	}

}
