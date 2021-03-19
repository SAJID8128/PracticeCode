package java_Class2;

import java_Class3.PublicModifier;

public class A_RegularMethod {
		
	public static void regularMethod() {
		
		System.out.println("I am Superman");
				
	}
	
	public static void main(String[] args) {
		
		// method from this class
		regularMethod(); 
		// from PublicModifier class of java_Class3
		PublicModifier bubu = new PublicModifier();	//	
		bubu.nyla();
	}
		
}
