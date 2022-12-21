
public class Secretary extends Staff{
	
	//super() refers variables which are used by parent class:
	
	public Secretary(int id, String fullName) {
		super(id, fullName);
	}
	
	//toString():
	
	public String toString()
	{
		return String.format("SECRETARY \n ID: %d \n Full Name: %s  \n", super.getId(), super.getFullName());
	}
	
	//Secretary's task information:
	
	public void getTaskInformation() {
		System.out.println("---TASK INFORMATION---");
		System.out.println("SECRETARY: organizing files "
				+ "preparing documents "
				+ "managing office "
				+ "supply inventory and "
				+ "scheduling appointments. \n");
	}
	
	//Secretary is able to change the lecturer:
	// course is changed by taking from lecturer2 to lecturer1
	public void changeLecturer(Course course, Lecturer lecturer1, Lecturer lecturer2)
	{	
		lecturer2.deleteCourse(course);
		course.changeLecturer(lecturer1);  //sekreter.changeLecturer(oop, ahmet);
	}
}
