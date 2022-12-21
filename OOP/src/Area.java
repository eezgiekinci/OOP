
public abstract class Area {
	//there is a information about Area that is roomName.
	
	private String roomName;
	
	
	//constructor:
	
	public Area(String roomName)
	{
		this.roomName = roomName;
	}
	
	//getter and setter:
	
	public void setRoomName(String roomName) { 
		this.roomName = roomName; 
	}
   	
	public String getRoomName() { 
    	
		return roomName; 
    	}
}
