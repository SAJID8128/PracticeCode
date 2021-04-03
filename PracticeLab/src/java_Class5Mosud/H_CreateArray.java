package java_Class5Mosud;

public class H_CreateArray {

	public static void main(String[] args) {
		int array[] = new int[7];
		for(int count=0;count<7;count++) {
			array[count]=count+1;
		}
		
		for(int count=0;count<7;count++) {
			System.out.println("array["+count+"]="+array[count]);
		}
		// System.out.println("Length of Array = "+array.length);
		// array[8] = 10;

	}

}
