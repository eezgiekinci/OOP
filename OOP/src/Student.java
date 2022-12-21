import java.util.*;


public abstract class Student<T extends Course> {
	
	// there are general information about a student. A student needs to register id, fullName and registeredYear.
	// Courses and grades which are taken by the student are array list because of size.
	// MINIMUM_COURSE_COUNT is what helps us to understand whether a student has taken enough courses to graduate.
	// MINIMUM_ELIGIBLE_LEVEL's meaning  is GPA.
	
	private int id;
	private String fullName;
	private int registeredYear;
	private ArrayList<T> courses;
	private ArrayList<Integer> grades;
	protected int MINIMUM_COURSE_COUNT;
	protected double MINIMUM_ELIGIBLE_LEVEL;
	
	//constructor of student class


	public Student(int id, String fullName, int registeredYear) {
		this.id = id;
		this.fullName = fullName;
		this.registeredYear = registeredYear;
		courses = new ArrayList<T>();
		grades =  new ArrayList<Integer>();
	}
	
	//getter:

	public int GetMinimumCoursesCount()
	{
		return MINIMUM_COURSE_COUNT;
	}

	
	//getter:
	public double GetEligibleLevel()            
	{
		return MINIMUM_ELIGIBLE_LEVEL;
	}
	
	//getter:

	public int getId() {
		return id;
	}

	//getter:
	
	public String getFullName() {
		return this.fullName;
	}
	
	//getter:

	public int getRegisteredYear() {
		return this.registeredYear;
	}
	
	//getter:

	public ArrayList<T> getCourses() {
		return courses;
	}
	
	//setter: Bİ DAHA BAK********************************* add

	public void setCourses(T course) {
		this.courses.add(course);
		this.grades.add(0);
	}
	
	//getter:
	
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	
	protected void setGrade(Course course, int newNote) 
	{

		for(int i = 0; i < courses.size() ; i++ ) {
			
			if(courses.get(i).getCode().equals(course.getCode())) {
				
				grades.set(i, newNote); 
				return;
			}
		}
		
		System.out.println("This student does not take this course");
		
	}
	
	protected void removeGrade(Course course) {
		
		for(int i = 0; i < courses.size() ; i++ ) {
			
			if(courses.get(i).getCode().equals(course.getCode())) {
				
				grades.set(i, 0); 
				return;
			}
		}
		System.out.println("There is no such a course that this student takes.");
		
	}
	
	// The abstract method that is called addCourse helps students to take a course:

	public abstract void addCourse(T course);
	
	/* calculateGpa() calculates student2s gpa. The lecturer gives the student's exam grade from 0 to 100.
	   
	   So, this method converts the grades to the 4th system and calculates the gpa.
	*/

	public double calculateGpa() {
		double temp = 0;
		double totalCredits = 0;
		double gpa = 0;
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) <= 100 && grades.get(i) >= 95)
				temp = 4.00;
			else if (grades.get(i) < 95 && grades.get(i) >= 90)
				temp = 3.67;
			else if (grades.get(i) < 90 && grades.get(i) >= 85)
				temp = 3.33;
			else if (grades.get(i) < 85 && grades.get(i) >= 80)
				temp = 3.00;
			else if (grades.get(i) < 80 && grades.get(i) >= 75)
				temp = 2.67;
			else if (grades.get(i) < 75 && grades.get(i) >= 70)
				temp = 2.33;
			else if (grades.get(i) < 70 && grades.get(i) >= 65)
				temp = 2.00;
			else if (grades.get(i) < 65 && grades.get(i) >= 60)
				temp = 1.33;
			else if (grades.get(i) < 60 && grades.get(i) >= 55)
				temp = 1.00;
			else if (grades.get(i) < 55 && grades.get(i) >= 50)
				temp = 0;
			else if (grades.get(i) < 50 && grades.get(i) >= 45)
				temp = 0;
			// FZ
			else
				temp = 0;
			gpa += courses.get(i).getCredit() * temp;
			totalCredits += courses.get(i).getCredit();
		}
		return gpa / totalCredits;
	}

}
