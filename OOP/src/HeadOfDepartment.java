public class HeadOfDepartment extends Lecturer{
	
	//super() refers variables which are used by parent class:
	
	public HeadOfDepartment(int id, String fullName) {
		super(id, fullName);
	}
	
	// HeadOfDepartment is a lecturer and able to give a certificate to students who are graduated.
	
	public void giveCertificate(Student student) 
	{
		int courseCount = student.getCourses().size();
		int threshold = student.GetMinimumCoursesCount();
		if(courseCount < threshold) {
			System.out.println("unable to graduate student!");
		}
		
		double gpa = student.calculateGpa();
		
		if(student.GetEligibleLevel() > gpa) 
		{
			System.out.println("unable to graduate student due to low GPA!");
		}
		
		System.out.printf("%s is graduated! \n", student.getFullName());
	}


}
