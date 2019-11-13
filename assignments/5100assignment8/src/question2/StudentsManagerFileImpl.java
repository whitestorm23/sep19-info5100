package question2;


import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StudentsManagerFileImpl implements StudentsManager {

	private StudentsManager manager = new StudentsManagerMapImpl();
	private String file = "students.txt";

	public StudentsManagerFileImpl() throws Exception {
		readDataFromFileAndAddToTheManager();
	}

	private void readDataFromFileAndAddToTheManager() throws Exception {
		File f = new File(file);
		if (f.exists() == false) {
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		Scanner s = new Scanner(fis);
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] tokens = l.split("\\|");
			Student student = new Student(tokens[0], tokens[1]);
			manager.addStudent(student);
		}

	}

	@Override
	public void addStudent(Student student) throws RuntimeException {
		manager.addStudent(student);
		writeIntoFile(student);
	}

	private void writeIntoFile(Student student) {
		try {
			FileOutputStream fos = new FileOutputStream(file, true);
			PrintStream ps = new PrintStream(fos);
			ps.println(student.getId() + "|" + student.getName());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent(String id) {
		manager.deleteStudent(id);
		rewriteContentsIntoFile();
	}

	private void rewriteContentsIntoFile() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			ArrayList<Student>arr=new ArrayList<Student>();
			arr=manager.getStudents();
			for (Student s : arr) {
				ps.println(s.getId() + "|" + s.getName());
			}

		} catch (Exception e) {

		}
		try {
			fos.close();
		} catch (Exception e) {

		}

	}

	@Override
	public boolean modifyStudent(String id, Student student) {
		manager.modifyStudent(id, student);
		rewriteContentsIntoFile();
		return false;

	}

	@Override
	public Student findStudent(String name) {
		return manager.findStudent(name);
	}

	@Override
	public int getStudentCount() {
		return manager.getStudentCount();
	}

	@Override
	public void display() {
		manager.display();

	}

	@Override
	public ArrayList<Student> getStudents() {
		return manager.getStudents();
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}