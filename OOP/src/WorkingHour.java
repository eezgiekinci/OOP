public class WorkingHour {
	//there are general information about working hour:
	
	private int start;
	private int end;
	
	
	//getter:
	
	public int getStartingHour() {
		return this.start;
	}
	
	//getter:

	public int getEndingHour() {
		return this.end;
	}
	
	//This method helps to change staff's working hours and to control:

	public void changeWorkingHours(int start, int end) {
		if(end <= start) {
			throw new Error("Invalid working hours interval");
		}
		this.start = start;
		this.end = end;
	}
	
	//method:
	
	public WorkingHour(int start, int end)
	{
		changeWorkingHours(start, end);
	}
}
