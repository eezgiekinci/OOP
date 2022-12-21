
public class UnderGraduate extends Student<UnderGraduateCourse> {
	
	//There are three category of student class. One of them is Undergraduate:
	//super() refers variables which are used by parent class:
	
	public UnderGraduate(int id, String fullName, int registeredYear) {
		super(id, fullName, registeredYear);
		super.MINIMUM_COURSE_COUNT = 40;
		super.MINIMUM_ELIGIBLE_LEVEL = 2.0;
	}
	
	//The method helps UnderGraduate Student to take course:
	
	public  void addCourse(UnderGraduateCourse course) {
		
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
		if(super.getCourses().size() < MINIMUM_COURSE_COUNT) {
			throw new RuntimeException("unable to graduate Doctoral student!");
		}
	}
	
}
