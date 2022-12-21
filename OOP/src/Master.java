
public class Master extends Student<GraduateCourse> {
	
	//There are three category of student class. One of them is Master Student:
	//super() refers variables which are used by parent class:
	
	public Master(int id, String fullName, int registeredYear) {
		super(id, fullName, registeredYear);
		super.MINIMUM_COURSE_COUNT = 7;
		super.MINIMUM_ELIGIBLE_LEVEL = 2.5;
	}
	
	//The method helps UnderGraduate Student to take course:

	public  void addCourse(GraduateCourse course) {
		
		if(super.getCourses().size() == 0) {
			super.getCourses().add(course);
			super.getGrades().add(0);
			return;
		} 
		
		for(int i = 0 ; i < super.getCourses().size() ; i++)
		{
			if(super.getCourses().get(i).getCode().equals(course.getCode()) ) {
				System.out.println("this course was already taken");
				return;
			}
		}
		super.setCourses(course);	
	}
	
	
	//Checks whether the student has graduated:
	
	
	public void Graduate() {
		if (super.getCourses().size() < MINIMUM_COURSE_COUNT) {
			System.out.println("unable to graduate Master student!");
		}
	}
}
