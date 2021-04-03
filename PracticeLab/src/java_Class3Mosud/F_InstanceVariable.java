package java_Class3Mosud;

public class F_InstanceVariable {
	
	int y=88; // instance variable
	
	public void instance() {
		
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		
		F_InstanceVariable x = new F_InstanceVariable();
		x.instance();
		
	}

}
