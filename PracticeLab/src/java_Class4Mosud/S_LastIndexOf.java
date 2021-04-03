package java_Class4Mosud;

public class S_LastIndexOf {

	public static void main(String[] args) {
		
		String str = "beginnersbook is for beginners";
		
		char ch = 'b';
		char ch2 = 's';	
		String subStr = "beginners";
		
		int posOfB = str.lastIndexOf(ch);
		int posOfS = str.lastIndexOf(ch2);
		int posOfSubstr = str.lastIndexOf(subStr);
		
		System.out.println(posOfB);
		System.out.println(posOfS);
		System.out.println(posOfSubstr);
		
	}

}
