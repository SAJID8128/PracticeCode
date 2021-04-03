package java_Class2Mosud;

public class C_CallingMethod_In_MM {
	
	 static int a=12;
	 static int b=33;
	 int result;
	
	
	
	public static void add() {
	
		int result = a+b;
		System.out.println("The result is " + result);
	
	}
	
	public static void substract() {
		
		int result = b-a;
		System.out.println("The result is " + result);
	}
	
	public static void main(String[]args) {
		
		add();
		substract();
		
	}
			
	
	

}
