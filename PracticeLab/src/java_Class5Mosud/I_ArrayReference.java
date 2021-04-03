package java_Class5Mosud;

public class I_ArrayReference {
	
	public static void passByReference(String a[]) {
		a[0] = "Changed";
	}

	public static void main(String[] args) {
		String []b= {"Apple","Mango","Orange"};
		System.out.println("Before Function Call "+b[0]);//Print the value: Apple
		I_ArrayReference.passByReference(b);
		System.out.println("After Function Call "+b[0]);//Print the value: Changed
	}

}
