
public abstract class Staff {
	
	// there are general information about staff:
	private int id;
	private String fullName;
	private WorkingHour workingHours;
	
	
	// constructor: 
	
	public Staff(int id, String fullName) 
	{
		this.id = id;
		this.fullName = fullName;
		this.workingHours = new WorkingHour(9, 18);
	}
	
	//getter and setter:
	
	public void setId(int id)
	{
		this.id  = id;
	}
	
	public int getId() 
	{
		return id;
	}
	
	//getter and setter:
	
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}
	
	public String getFullName() 
	{
		return fullName;
	}
	
	//getter and setter:
	
	public void setWorkingHours(int start, int end)
	{
		this.workingHours.changeWorkingHours(start, end);
	}
		
	public WorkingHour getWorkingHours() 
	{
		return this.workingHours;
	}
	
	// Every staff has their task information:
	
	public abstract void getTaskInformation();
}
