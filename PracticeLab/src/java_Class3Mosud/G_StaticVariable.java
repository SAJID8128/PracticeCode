package java_Class3Mosud;

public class G_StaticVariable {
	
	static int z=33; // static variable
	
	void method() {
		
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		G_StaticVariable x = new G_StaticVariable();
		x.method();
	}

}
