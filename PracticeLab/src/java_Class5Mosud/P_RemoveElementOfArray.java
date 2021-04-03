package java_Class5Mosud;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class P_RemoveElementOfArray {
	
	static int[] intArray = {1,2,3,4,5};
	static int[] removed = ArrayUtils.removeElement(intArray, 3);

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removed));

	}

}
