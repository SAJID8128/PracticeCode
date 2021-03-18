package java_Class2;

public class O_CallMethod_InSameClass {
	
	public static void method1() {
		
		System.out.println("My name is Nyla.");
	}
	
	public static void method2() {
		
		System.out.println("My age is 12.");
	}
	
	public static void allMethods() {
		
		method1();
		method2();
	}

	public static void main(String[] args) {
		
		allMethods();

	}

}
