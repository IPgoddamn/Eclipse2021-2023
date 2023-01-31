package finalGroup16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dispatcher {
	public static void main(String[] args) {
		System.out.println(StudyYear.isStudyYearEnded);
		final Student S0 = new Student("Mary", new ArrayList<Integer>(Arrays.asList(10, 2, 7, 8, 11, 9)));
		final Student S1 = new Student("John", new ArrayList<Integer>(Arrays.asList(9, 4, 6, 7, 3)));
		final Student S2 = new Student("Nick", new ArrayList<Integer>(Arrays.asList(10, 9, 9, 11)));
		final Student S3 = new Student("Billie", new ArrayList<Integer>(Arrays.asList(12, 11, 7, 10, 7, 8, 9)));
		final Student S4 = new Student("Micheal", new ArrayList<Integer>(Arrays.asList(6, 5, 7, 8, 10, 11, 4)));
		Group g = new Group(new ArrayList<Student>(Arrays.asList(S0, S1, S2, S3, S4)));
		System.out.print(g);
		// Here you can change everything
		System.out.println(g.getStudent(3));
		g.getStudent(1).addMark(11);
		System.out.println(g.getStudent(1));
		////////// END OF THE YEAR //////////

		StudyYear.endStudyYear();
		g = new Group(Collections.unmodifiableList(g.getStudents()));
		// But now you can't
		final Student S5 = new Student("Micheal", new ArrayList<Integer>(Arrays.asList(6, 5, 7, 8, 10, 11, 4)));
		g.addStudent(S5);
		g.getStudent(4).setMark(1, 4);
		System.out.println(g);
	}
}

class Student {
	private String name;
	private List<Integer> marks;

	Student(String name, List<Integer> marks) {
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return this.name + " : " + marks;
	}

	final public String getName() {
		return name;
	}

	final void setName(String newName) {
		if (!StudyYear.isStudyYearEnded) {
			System.out.println(this.name + "'s new name is " + newName);
			this.name = newName;
		} else {
			System.out.println("Have no access.");
		}
	}

	final void addMark(int newMark) {
		if (!StudyYear.isStudyYearEnded) {
			System.out.println(this.name + " got a new mark: " + newMark + ".");
			this.marks.add(newMark);
		} else {
			System.out.println("Have no access.");
		}
	}

	final void setMark(int index, int newMark) {
		if (!StudyYear.isStudyYearEnded) {
			System.out.println(this.name + "'s mark on " + (index + 1) + " place has been replaced by " + newMark);
			this.marks.set(index, newMark);
		} else {
			System.out.println("Have no access.");
		}
	}
}

class Group {
	private List<Student> students;

	Group(List<Student> students) {
		this.students = students;
	}

	public String toString() {
		String s = "";
		for (Student temp : this.students) {
			s += temp.toString() + "\n";
		}
		return s;
	}

	final public List<Student> getStudents() {
		return students;
	}

	final public Student getStudent(int index) {
		return students.get(index);
	}

	final void addStudent(Student newStudent) {
		if (!StudyYear.isStudyYearEnded) {
			System.out.println(newStudent.getName() + " is a new student.");
			this.students.add(newStudent);
		} else {
			System.out.println("Have no access.");
		}
	}
}

class StudyYear {
	static boolean isStudyYearEnded;

	static void beginStudyYear() {
		System.out.println("StudyYear has begun!");
		StudyYear.isStudyYearEnded = false;
	}

	static void endStudyYear() {
		System.out.println("StudyYear has ended!");
		StudyYear.isStudyYearEnded = true;
	}
}