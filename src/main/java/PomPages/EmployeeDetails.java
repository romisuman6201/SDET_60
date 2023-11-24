package PomPages;

public class EmployeeDetails {
	
	String name;
	String city;
	String gmail;
	
	public EmployeeDetails(String name,String city,String gmail) {
		this.name=name;
		this.city=city;
		this.gmail=gmail;
	}
	public EmployeeDetails() 
	{
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

}
