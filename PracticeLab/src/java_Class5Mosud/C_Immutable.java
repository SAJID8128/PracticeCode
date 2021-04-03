package java_Class5Mosud;

// make this class final, no one can extend this class
public final class C_Immutable {
	
	private String name;
	
	C_Immutable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// no setter

	public static void main(String[] args) {
		C_Immutable obj = new C_Immutable("mkyong");
		System.out.println(obj.getName());
		
		// there is no was to update the name after the object is created
		// obj.setName("new mkyong");
		// System.out.println(obj.getName());
		
	}

}
