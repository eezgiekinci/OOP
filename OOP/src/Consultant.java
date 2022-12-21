import java.util.*;

public class Consultant extends Lecturer{
	
	//super() refers variables which are used by parent cStudent<Course>	
	private ArrayList<Student> studentIds;
	
	public Consultant (int id, String fullName) 
	{
			super(id, fullName);
			studentIds = new ArrayList<Student>();
	}
		
	//Consultant keeps the IDs of the students who took courses:
		
	public void addNewStudentId(Student student)
	{
    		studentIds.add(student);
    }
	
	public ArrayList<Student> getStudentIds() 
	{
		return studentIds;
	}
	/*
	public ArrayList<Student> findStudentWithCourse(String courseName)
	{
		
		ArrayList<Student> studentsWithCourseName = new ArrayList<Student>();
		
		for(int i = 0 ; i< studentIds.size(); i++)
		{
			for(int j = 0; j< studentIds.get(i).getCourses().size(); j++)
			{
				if(courseName.equals(studentIds.get(i).getCourses().get(j).getName()))
				{
					studentsWithCourseName.add(studentIds.get(i));
				}
			}
		}
		return studentsWithCourseName;
	}
	*/
}
