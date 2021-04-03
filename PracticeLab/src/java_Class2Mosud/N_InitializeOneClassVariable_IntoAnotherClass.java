package java_Class2Mosud;

public class N_InitializeOneClassVariable_IntoAnotherClass {

	public static void main(String[] args) {
		
		H_UseClassAndVariable_InAnotherClass t = new H_UseClassAndVariable_InAnotherClass();
		int n1 = t.a; 
		int n2 = t.b;
		
		System.out.println(n1+ " "+n2);

	}

}
