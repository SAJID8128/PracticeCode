package java_Class5Mosud;

import java.util.Arrays;

public class M_ArrayContainsCertainValue {
	
	static String[] stringArray = {"a","b","c","d","e"};
	static boolean b = Arrays.asList(stringArray).contains("a");
	
	public static void main(String[] args) {
		System.out.print(b);
	}
	
}