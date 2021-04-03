package java_Class4Mosud;

public class P_CompareToIgnoreCase {

	public static void main(String[] args) {
		
		String string1 = "HELLO";
		String string2 = "hello";
		String string3 = "HellO";
		
		int var1 = string1.compareToIgnoreCase(string2);
		System.out.println("string1 and string2 comparison: "+var1);
		
		int var2 = string1.compareToIgnoreCase(string3);
		System.out.println("string1 and string3 comparison: "+var2);
		
		int var3 = string1.compareToIgnoreCase("HeLLo");
		System.out.println("string1 and HeLLo comparison: "+var3);
		
	}

}
