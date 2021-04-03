package java_Class5Mosud;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraySort {
	
	public static void main(String[] args) {
		// Initializing unsorted Object array
		Object[] obj = {27,11,5,44};
		
		// let us print all the elements available in the list
		for(Object number: obj) {
			System.out.println("Number = "+number);
		}
		
		//sorting array from index 1 to 3
		Arrays.sort(obj,1,3);
		System.out.println("");
		
		//let us print all the elements available in list
		System.out.println("Object array with some sorted values(1 to 3) is:");
		for (Object number: obj) {
			System.out.println("Number = "+number);
		}
	}

}
