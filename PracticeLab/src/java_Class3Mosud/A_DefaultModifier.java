package java_Class3Mosud;

public class A_DefaultModifier {

		
static class DefaultOne {
	
	int b = 5;
	int c = 6;
		
}

static class DefaultTwo {
	
	int a = 4;
	int d = 9;
	
}

	public static void main(String[] args) {
		
		DefaultTwo k = new DefaultTwo();
		DefaultOne l = new DefaultOne();	
		System.out.println(l.b + l.c);
		System.out.println(k.a + k.d);
		
					
	}

}
