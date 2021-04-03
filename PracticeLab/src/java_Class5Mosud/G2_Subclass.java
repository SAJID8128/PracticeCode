package java_Class5Mosud;

public class G2_Subclass extends G1_SuperClass { // subclass aka child class
	// overrides method from parent
	@Override
	public void printMethod() {
		super.printMethod(); // calls method in SuperClass (parent)
		System.out.println("Printed in Subclass");
	}

}
