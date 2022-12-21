
public class CleaningStaff extends Staff {
	
	//super() refers variables which are used by parent class:
	
	public CleaningStaff(int id, String fullName) {
		super(id, fullName);
	}
	
	public String toString()
	{
		return String.format("CLEANING STAFF \n ID: %d \n Full Name: %s  \n", super.getId(), super.getFullName());
	}
	
	// Cleaning Staff's task information:
	
	public void getTaskInformation() {
		System.out.println("---TASK INFORMATION---");
		System.out.println("CLEANING STAFF: all basic cleaning in and around the facility or office building. \n");
	}
}
