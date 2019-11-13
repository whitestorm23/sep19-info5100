package question2;

import java.util.ArrayList;

public class StudentsManagerListImpl implements StudentsManager {

	private ArrayList<Student> students = new ArrayList<Student>();

	@Override
	public void addStudent(Student student) {
		students.add(student);

	}

	@Override
	public void deleteStudent(String id) {
		Student match = null;
		for (Student x : students) {
			if (x.getId().equals(id)) {
				match = x;
				break;
			}
		}
		students.remove(match);
	}

	@Override
	public boolean modifyStudent(String id, Student student) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				s.setName(student.getName());
				return true;
			}
		}
		return false;

	}

	@Override
	public Student findStudent(String name) {
		for (Student s : students) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public int getStudentCount() {
		return students.size();
	}

	@Override
	public void display() {
		System.out.println(students);

	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
