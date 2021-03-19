package java_Class2;

import java_Class3.B_PublicModifier;

public class A_RegularMethod {
		
	public static void regularMethod() {
		
		System.out.println("I am Superman");
				
	}
	
	protected void huda() {
		
		System.out.println("Nyla is number 1!");
	}
	
	public static void main(String[] args) {
		
		// method from this class
		regularMethod(); 
		// from PublicModifier class of java_Class3
		B_PublicModifier bubu = new B_PublicModifier();	//	
		bubu.nyla();
	}
		
}


