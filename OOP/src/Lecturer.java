import java.util.ArrayList;

//import contracts.ExceptionHandling;


public class Lecturer {
	
	// there are general information about lecturer:
	
	private int id;
	private String fullName;
	private int givenCourses = 0;
	private final int MAX_C = 10;
	private ArrayList<Course> courses;
	
	//constructor:
	 
	public Lecturer(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
		courses = new ArrayList<Course>();
	}
	
	//getter and setter:

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	//getter:

	public int GetId() {
		return id;
	}
	
	//getter:
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	//getter:
	public int getGivenCourses() 
	{
		return givenCourses;
	}
	
	
	
	// The method is called AddCourse helps lecturer to take course or courses. However, the number of courses that each lecturer can take is limited.
	
	public void AddCourse(Course course) {
		if(givenCourses == 0) {
			this.courses.add(course);
			this.courses.get(0).setLecturer(this);
			this.givenCourses++;
			return;
		}
		
		if(this.givenCourses == MAX_C) {
			System.out.println("maximum number of courses are reached");
			return;
		}
		
		for (int i = 0; i < givenCourses; i++) {
			if(this.courses.get(i).getCode().equals(course.getCode()) ) {
				System.out.println("this course was already taken");
				return;
			}
		}
		this.courses.add(course);
		this.courses.get(givenCourses).setLecturer(this);
		this.givenCourses++;
	}
	
	// The method is called deleteCourse() helps to secretary to delete course from lecturer:
	
	public void deleteCourse(Course course) 
	{
		if(givenCourses == 0) {
			System.out.println("This lecturer has not any courses.");
		}
		
		else {
			
			for(int i = 0; i < givenCourses ; i++) {
				if(course.getCode().equals(courses.get(i).getCode()))
				{
					courses.remove(i);
					givenCourses--;
					
				}
			}			
		}
	}
	
	// Lecturer can add&change note to any student who has taken the lecturer's course, setGrade():
	
	public void setGrade(Course course, Student student, int note) 
	{
		boolean check = false;
		int i;
		if(note<0 || note > 100)
		{
			System.out.println("Warning : Grade should be between 0 and 100.");
			return;
		}
		
		for(i = 0; i <courses.size();i++)
		{
			if( student.getCourses().size() == 0) {
				break;
			}
			if(courses.get(i).getCode().equals(course.getCode())) 
			{
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println("The grade is set to "+ note +" for "+student.getFullName());
			student.setGrade(course,note);
		}
		else
			System.out.println("This lecturer does not give that course.");
	}
	
	// Lecturer can delete note from any student who has taken the lecturer's course, removeGrade():
	
}
































