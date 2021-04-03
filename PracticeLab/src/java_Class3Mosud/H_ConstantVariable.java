package java_Class3Mosud;

public class H_ConstantVariable {
	
	static final int myvar=99; // constant variable
		
	void method() {
		
		System.out.println(myvar);
		
	}
	
	public static void main(String[] args) {
		
		H_ConstantVariable x = new H_ConstantVariable();
		x.method();
	}

}
