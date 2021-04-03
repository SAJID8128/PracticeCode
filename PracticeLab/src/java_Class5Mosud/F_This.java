package java_Class5Mosud;

public class F_This {
	
	private String color;
	
	public void house(String color) {
		//this keyword is required, same parameter name as field
		this.color = color;
	}
	
	public String getColor() {
		//this is optional
		return color; // same as return this.color;
	}
	
	public void setColor(String color) {
		//this keyword is required, same parameter name as field
		this.color = color;
	}

}
