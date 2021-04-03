package java_Class5Mosud;

public class E_GetterAndSetter {
	
	private int number;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}

}

// GetterAndSetter obj = new GetterAndSetter();
// obj.number = 10; // compile error, since number is private
// int num = obj.number; // same as above

// GetterAndSetter obj = new GetterAndSetter();
// obj.setNumber(10); // OK
// int num = obj.getNumber(); // fine