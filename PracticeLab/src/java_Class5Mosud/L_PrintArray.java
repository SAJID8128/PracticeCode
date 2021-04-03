package java_Class5Mosud;

import java.util.Arrays;

public class L_PrintArray {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5,};
		String intArrayString = Arrays.toString(intArray);
		//print directly will print reference value
		System.out.println(intArray);
		//[@7150bd4d
		System.out.println(intArrayString);
		//[1,2,3,4,5]

	}

}
