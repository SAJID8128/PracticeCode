package java_Class5Mosud;

public class D_Mutable {

	
		
		private String name;
		
		D_Mutable(String name) {
			this.name = name;
		}
		
		public String getName() {	
			return name;
		}
		
		//this setter can modify the name
		public void setName(String name) {
			this.name = name;
		}
		
		public static void main(String[] args) {
			D_Mutable obj = new D_Mutable("mkyong");
			System.out.println(obj.getName());
			//update the name, this object is mutable
			obj.setName("new mkyong");
			System.out.println(obj.getName());

	}

}
