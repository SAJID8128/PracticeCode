package java_Class3Mosud;

public class B_PublicModifier {
	
	static int num = 8128;
	
	public static void nyla() {
		
		System.out.println("I love my beautiful Bubu!");
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		nyla();
		D_PrivateModifier m = new D_PrivateModifier();
		m.display();
		
	}

}
