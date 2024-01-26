package oopproject;

import java.util.Scanner;
import java.util.ArrayList;

public class Excuting {
	static ArrayList<person> storestudent = new ArrayList();
	static ArrayList<person> storeInstractors = new ArrayList();
	static ArrayList<person> storeAdministrators = new ArrayList();
	static ArrayList<person> storetechnicians = new ArrayList();

	static Scanner sc = new Scanner(System.in);

	public static void addstudent() {
		try {
			Student s = new Student();
			System.out.println("Enter your name ");
			s.setName(sc.next());
			System.out.println("Enter your ID ");
			s.setId(sc.nextInt());

			System.out.println("Enter the number of your courses ");
			s.setCourses(sc.nextInt());
			System.out.println("Enter the Date ");
			Date r = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
			s.setDate(r);
			System.out.println("The Student Sucessfully added.\n ");
			storestudent.add(s);

		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	static void displaystudent() {
		try {
			for (int i = 0; i < storestudent.size(); i++) {
				Student s = (Student) storestudent.get(i);
				s.print();
			//	System.out.println(s.toString());
				//System.out.println(s.print());
			}
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	static void removestudent() {
		try {
			System.out.println("Enter the student id.\n ");
			Scanner sc = new Scanner(System.in);
			int g = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storestudent.size(); i++) {
				Student s = (Student) storestudent.get(i);
				if (s.id == g) {
					storestudent.remove(s);
					done=true;
					System.out.println("The student with the name"+s.name+"sucessfully removed\n");
					break;
				}
			}
			if(done==false)System.out.println("Invalid ID\n");

		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	public static void Editstudent() {
		try {
			System.out.print("Enter student ID");
			int p = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storestudent.size(); i++) {
				Student s = (Student) storestudent.get(i);
				if (s.getId() == p) {
					System.out.println("Enter your name ");
					s.setName(sc.next());
					System.out.println("Enter the number of your courses.\n");
					s.setCourses(sc.nextInt());
					done=true;
					System.out.println("Data sucessfuly edited.\n");
					break;
				}

			}
			if(done==false)System.out.println("Invalid ID\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}

	}

	public static void addInstractors() {
		try {
			Instractors s = new Instractors();
			System.out.println("Enter your name ");
			s.setName(sc.next());
			System.out.println("Enter your ID ");
			s.setId(sc.nextInt());
			System.out.println("Enter the salary");
			s.setSalary(sc.nextFloat());
			System.out.println("Enter your job ");
			s.setJob(sc.next());
			System.out.println("Enter your course ");
			s.setCourse(sc.next());
			storeInstractors.add(s);
			System.out.println("Data sucessfuly edited.\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	static void displayInstractors() {
		try {
			for (int i = 0; i < storeInstractors.size(); i++) {
				Instractors s = (Instractors) storeInstractors.get(i);
				System.out.println(s.toString());
			}
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	static void removeInstractors() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID\n");
			boolean done=false;
			int g = sc.nextInt();
			for (int i = 0; i < storeInstractors.size(); i++) {
				Instractors s = (Instractors) storeInstractors.get(i);
				if (s.id == g) {
					storeInstractors.remove(s);
					done=true;
					System.out.println("The Instractor with the name"+s.name+"sucessfully removed\n");
					break;
				}
			}
			if(done==false)System.out.println("Invalid ID\n");

		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	public static void EditInstractors() {
		try {
			System.out.print("Enter Instractors ID");
			int p = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storeInstractors.size(); i++) {
				Instractors s = (Instractors) storeInstractors.get(i);
				if (s.getId() == p) {
					System.out.println("Enter your name ");
					s.setName(sc.next());
					System.out.println("Enter the salary");
					s.setSalary(sc.nextFloat());
					System.out.println("Enter your job ");
					s.setJob(sc.next());
					System.out.println("Enter your course ");
					s.setCourse(sc.next());
					done=true;
					System.out.println("Data sucessfuly edited.\n");
					break;
				}

			}
			if(done==false)System.out.println("Invalid ID\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}

	}

	public static void addAdministrators() {
		try {
			Administrators s = new Administrators();
			System.out.println("Enter your name ");
			s.setName(sc.next());
			System.out.println("Enter your ID ");
			s.setId(sc.nextInt());
			System.out.println("Enter the salary");
			s.setSalary(sc.nextFloat());
			System.out.println("Enter your job ");
			s.setJob(sc.next());
			System.out.println("Enter your depart ");
			s.setDepart(sc.next());
			storeAdministrators.add(s);
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}

	}

	static void displayAdministrators() {
		try {
			for (int i = 0; i < storeAdministrators.size(); i++) {
				Administrators s = (Administrators) storeAdministrators.get(i);
				System.out.println(s.toString());
			}
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	static void removeAdministrators() {
		try {
			System.out.println("Enter ID\n");
			Scanner sc = new Scanner(System.in);
			int g = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storeAdministrators.size(); i++) {
				Administrators s = (Administrators) storeAdministrators.get(i);
				if (s.id == g) {
					storeAdministrators.remove(s);
					done=true;
					System.out.println("The Administrator with the name"+s.name+"sucessfully removed\n");
					break;
				}
			}
			if(done==false)System.out.println("Invalid ID\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	public static void EditAdministrators() {
		try {
			System.out.print("EnterAdministrators ID");
			int p = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storeAdministrators.size(); i++) {
				Administrators s = (Administrators) storeAdministrators.get(i);
				if (s.getId() == p) {
					System.out.println("Enter your name ");
					s.setName(sc.next());
					System.out.println("Enter the salary");
					s.setSalary(sc.nextFloat());
					System.out.println("Enter your job ");
					s.setJob(sc.next());
					System.out.println("Enter your depart ");
					s.setDepart(sc.next());
					done=true;
					System.out.println("Data sucessfuly edited.\n");
					break;
				}
			}
			if(done==false)System.out.println("Invalid ID\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}

	}

	public static void addtechnicians() {
		try {
			technicians s = new technicians();
			System.out.println("Enter your name ");
			s.setName(sc.next());
			System.out.println("Enter your ID ");
			s.setId(sc.nextInt());
			System.out.println("Enter the salary");
			s.setSalary(sc.nextFloat());
			System.out.println("Enter your job ");
			s.setJob(sc.next());
			System.out.println("Enter your  num_hours ");
			s.setNum_hours(sc.nextInt());
			storetechnicians.add(s);
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
		}
	}

	static void displaytechnicians() {
		try {
			for (int i = 0; i < storetechnicians.size(); i++) {
				technicians s = (technicians) storetechnicians.get(i);
				System.out.println(s.toString());
			}
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	static void removetechnicians() {
		try {
			System.out.println("Enter ID\n");
			Scanner sc = new Scanner(System.in);
			int g = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storetechnicians.size(); i++) {
				technicians s = (technicians) storetechnicians.get(i);
				if (s.id == g) {
					storetechnicians.remove(s);
					done=true;
					System.out.println("The Administrator with the name"+s.name+"sucessfully removed\n");
					break;
				}
			}
			if(done==false)System.out.println("Invalid ID\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	public static void Edittechnicians() {
		try {
			System.out.print("Enter technicians ID");
			int p = sc.nextInt();
			boolean done=false;
			for (int i = 0; i < storetechnicians.size(); i++) {
				technicians s = (technicians) storetechnicians.get(i);
				if (s.getId() == p) {
					System.out.println("Enter your name ");
					s.setName(sc.next());
					System.out.println("Enter the salary");
					s.setSalary(sc.nextFloat());
					System.out.println("Enter your job ");
					s.setJob(sc.next());
					System.out.println("Enter your num_hours ");
					s.setNum_hours(sc.nextInt());
					done=true;
					System.out.println("Data sucessfuly edited.\n");
					break;
				}

			}
			if(done==false)System.out.println("Invalid ID\n");
		} catch (Exception e) {
			System.out.println("_problem Occured.....");
			sc.next();
		}
	}

	public static void main(String[] ages) {
		int a, b, c;
		String s;
		System.out.println("IF you want to dealwith student information Enter 1 ..");
		System.out.println("IF you want to dealwith Instractors information Enter 2 ..");
		System.out.println("IF you want to dealwith Administrators information Enter 3 ..");
		System.out.println("IF you want to dealwith technicians information Enter 4 ..\n");

		while (true) {

			b = sc.nextInt();
			if (b == 1) {
				while (true) {
					try {
						System.out.println("IF you want use adding operation Enter num 1  ....\n");
						System.out.println("IF you want use remove operation Enter num 2  ....\n");
						System.out.println("IF you want use display operation Enter num 3 ....\n");
						System.out.println("IF you want use Edit operation Enter num 4 ....\n");
						a = sc.nextInt();
						if (a == 1) {
							addstudent();
						} else if (a == 2) {
							removestudent();
						} else if (a == 3) {
							displaystudent();

						} else if (a == 4) {
							Editstudent();
						} else if (a <= 0 || a >= 5) {
							System.out.println("_problem Occured.....");
							sc.next();
						}
						
					} catch (Exception e) {
						System.out.println("_problem Occured.....");
						sc.next();
					}
				}
			} else if (b == 2) {
				while (true) {
					try {

						System.out.println("IF you want use adding operation Enter num 1  ....\n");
						System.out.println("IF you want use remove operation Enter num 2  ....\n");
						System.out.println("IF you want use display operation Enter num 3 ....\n");
						System.out.println("IF you want use Edit operation Enter num 4 ....\n");
						a = sc.nextInt();
						if (a == 1) {
							addInstractors();
						} else if (a == 2) {
							removeInstractors();
						} else if (a == 3) {
							displayInstractors();

						} else if (a == 4) {
							EditInstractors();
						} else if (a <= 0 || a >= 5)
						{
							System.out.println("_problem Occured.....");
							sc.next();
						}
					}

					catch (Exception e) {
						System.out.println("_problem Occured.....");
						sc.next();
					}
				}
			} else if (b == 3) {
				while (true) {
					try {
						System.out.println("IF you want use adding operation Enter num 1  ....\n");
						System.out.println("IF you want use remove operation Enter num 2  ....\n");
						System.out.println("IF you want use display operation Enter num 3 ....\n");
						System.out.println("IF you want use Edit operation Enter num 4 ....\n");
						a = sc.nextInt();
						if (a == 1) {
							addAdministrators();
						} else if (a == 2) {
							removeAdministrators();
						} else if (a == 3) {
							displayAdministrators();

						} else if (a == 4) {
							EditAdministrators();
						} else if (a <= 0 || a >= 5)
						{
							System.out.println("_problem Occured.....");
							sc.next();
						}
					} catch (Exception e) {
						System.out.println("_problem Occured.....");
						sc.next();
					}

				}
			} else if (b == 4) {
				while (true) {
					try {

						System.out.println("IF you want use adding operation Enter num 1  ....\n");
						System.out.println("IF you want use remove operation Enter num 2  ....\n");
						System.out.println("IF you want use display operation Enter num 3 ....\n");
						System.out.println("IF you want use Edit operation Enter num 4 ....\n");
						a = sc.nextInt();
						if (a == 1) {
							addtechnicians();
						} else if (a == 2) {
							removetechnicians();
						} else if (a == 3) {
							displaytechnicians();

						} else if (a == 4) {
							Edittechnicians();
						} else if (a <= 0 || a >= 5)
						{System.out.println("_problem Occured.....");
						sc.next();}

					} catch (Exception e) {
						System.out.println("_problem Occured.....");
						sc.next();
					}
				}
			} else {
				System.out.println("_problem Occured.....");
				sc.next();;
				}
		}
	}
}
