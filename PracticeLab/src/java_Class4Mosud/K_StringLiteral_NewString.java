package java_Class4Mosud;

public class K_StringLiteral_NewString {

	public static void main(String[] args) {
		
		//creating a string by java string literal
		String str = "BeginnersBook";
				
		//converting char array arrch[] to string str2	
		char[] arrch = {‘h’,‘e’,‘l’,‘l’,‘o’};
		String str2 = new String(arrch);
		
		//creating another java string str3 by using new keyword
		String str3 = new String("Java String Example");
		
		//Displaying all the three strings
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
