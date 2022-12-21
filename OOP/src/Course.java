
//import contracts.ExceptionHandling;


public abstract class Course {
	
	//there are general information about course:
	
	private String code;
	private String name;
	private int credit;
	private String location;
	private Lecturer lecturer;
	
	
	//constructor: 
	
	public Course(String code, String name, int credit) {
		this.code = code;
		this.name = name;
		this.credit  = credit;
	}
	
	//getter and setter:
	
	public String getName() { 
		return name; 
	}
    
	public void setName(String name) {
	    this.name = name;
	}

	//getter and setter:
	
    public void setLocation(String location) { 
		this.location = location;
	}
    public String getLocation() { 
		return location; 
	}
	
	//getter and setter:

    public String getCode() 
    { 
		return code;
		
    }
    public void setCode(String code) 
    { 
		this.code = code;
	}
	
	//getter and setter:

    public int getCredit() { 
		return credit;
	}
    public void setCredit(int credit) { 
		this.credit = credit;
	}
	
	//getter and setter:
	
	public Lecturer getLecturer(){
      	  return this.lecturer;
   	 }
    
    public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
    
    public void changeLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
		lecturer.AddCourse(this);
	}
	
}
