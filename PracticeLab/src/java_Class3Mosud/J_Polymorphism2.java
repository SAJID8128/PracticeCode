package java_Class3Mosud;

public class J_Polymorphism2 {
	
public static void main(String[] args) {
		
		J_Polymorphism_Car x = new J_Polymorphism_Car();
		J_Polymorphism_Car y = new Classic();
		J_Polymorphism_Car z = new Timeless();
		x.makeModel();
		y.makeModel();
		z.makeModel();
	}

}
