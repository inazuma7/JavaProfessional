package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
		
	public static List<Student> students = new ArrayList<Student>();

	private String firstName, lastName, city;
	private int age;

	public Student(String firstName, String lastName, int age, String city) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static Student getStudent(List<Student> students, String firstName, String lastName) {
		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
				return student;
		}
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s is %d years old.", firstName, lastName, age);
	}

	
	
	//main method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter {firstName} {lastName} {age} {city}:");
		String line = "";
		while(!line.equals("end")) {
			line = sc.nextLine();
			if (line.equals("end") || line.split(" ").length != 4)
				continue;
			String[] data = line.split(" ");
			Student exist = Student.getStudent(Student.students, data[0], data[1]);
			if (exist != null) {
				exist.setAge(Integer.parseInt(data[2]));
				exist.setCity(data[3]);
			} else {
				Student newStudent = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
				Student.students.add(newStudent);
			}
		}
		
		System.out.print("Enter a city: ");
		String city = sc.nextLine();
		for (Student s: Student.students) {
			if (s.getCity().equals(city))
				System.out.println(s);
		}
	}


	}