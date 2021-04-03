package java_Class2Mosud;

public class M_CallParameterizedConstructorTo_InitializeObject {

	public static void main(String[] args) {
		
		K_ParameterizedConstructor m1 = new K_ParameterizedConstructor(20);
		K_ParameterizedConstructor m2 = new K_ParameterizedConstructor(40);
		
		System.out.println(m1.x+ " "+m2.x);

	}

}
