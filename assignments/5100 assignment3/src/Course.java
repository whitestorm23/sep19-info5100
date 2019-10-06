import java.lang.*;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class Course {
	private int CourseId;
	private String CourseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds;
	
	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		if(courseId==0||courseId<0) {
			throw new IllegalArgumentException("should be more than zero");
		}
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		if(CourseName.length()<10||CourseName.length()>60) {
			throw new IllegalArgumentException("should be greater than 10 and less than 60");
		}
		CourseName = courseName;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		if(maxCapacity<10||maxCapacity>100) {
			throw new IllegalArgumentException("should be greater than 10 and less than 100");
		}
		this.maxCapacity = maxCapacity;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		int num=Integer.toString(professorId).length();
		if(num!=6) {
			throw new IllegalArgumentException("should be six digit integer ");
			}
		this.professorId = professorId;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		if(credits>10||credits<0) {
			throw new IllegalArgumentException("should be a single digit but greater than 0");
			
		}
		this.credits = credits;
	}

	public int[] getStudentIds() {
		return studentIds;
	}

	public void registerStudentId(int studentId,int index) {
	
		studentIds[index] = studentId;
		
	}

	
	
	public Course(int CourseId) {
		this.CourseId=CourseId;
	}

	public Course(int CourseId,int professorId) {
		this.CourseId=CourseId;
		this.professorId=professorId;
	}
	
	public Course(int CourseId,int professorId, int credits) {
		this.CourseId=CourseId;
		this.professorId=professorId;
		this.credits=credits;
	}
	
	public int[] removeDuplicates(int[] studentIds) {
		List<Integer> list = new ArrayList<Integer>(); 
		if(studentIds.length>=this.maxCapacity) {
			for (int i=0; i<studentIds.length; i++) {    
		        if(!list.contains(studentIds[i])) {    
		            list.add(studentIds[i]);    
		        }    
		    }    
			int[] newStudentIds = new int[list.size()];

		    //使用for循环得到数组
		    for(int i = 0; i < list.size();i++){
		    	newStudentIds[i] = list.get(i);
		    }
		
		return newStudentIds;
		}
		throw new IllegalArgumentException("course has not reached the maximum capacity");

	}
	
	public int groupsOfStudents(int[] studentIds) {
		int num=0;
		for(int i=0;i<studentIds.length;i++) {
			for(int j=i+1;j<studentIds.length;j++) {
				if((studentIds[i]+studentIds[j]%2==0)) {
					num++;
				}
			}
			
		}
		return num;

	}
	
}

