package question2;

import java.util.ArrayList;

public interface StudentsManager {
	public void addStudent(Student student);

	public void deleteStudent(Student student);

	public boolean modifyStudent(String id, Student student);

	public Student findStudent(String name);

	public int getStudentCount();

	public void display();

	void deleteStudent(String id);

	public ArrayList<Student> getStudents();

}
