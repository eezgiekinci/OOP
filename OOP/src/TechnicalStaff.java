
public class TechnicalStaff extends Staff {
	
	//super() refers variables which are used by parent class:
	
	public TechnicalStaff(int id, String fullName) {
		super(id, fullName);
	}
	
	public String toString()
	{
		return String.format("TECHICAL STAFF \n ID: %d \n Full Name: %s \n", super.getId(), super.getFullName());
	}
	
	// Cleaning Staff's task information:
	
	public void getTaskInformation() {
		System.out.println("---TASK INFORMATION---");
		System.out.println("TECHINAL STAFF: manage, maintain, and repair IT systems. \n");
	}
}
