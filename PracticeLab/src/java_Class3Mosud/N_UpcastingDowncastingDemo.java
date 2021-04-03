package java_Class3Mosud;

public class N_UpcastingDowncastingDemo {

	public static void main(String[] args) {
		
		M_UpcastingDowncasting_Animal a = new M_UpcastingDowncasting_Animal();
		M_UpcastingDowncasting_Dog d = new M_UpcastingDowncasting_Dog();
		a.walk();
		d.walk();
		d.sleep();
		
		
		//upcasting
		M_UpcastingDowncasting_Animal a2 = (M_UpcastingDowncasting_Animal)d;
		a2.walk();
		//a2.sleep(); error
		
		//Second way of doing upcasting is 
		//M_UpcastingDowncasting_Animal animal = new M_UpcastingDowncasting_Dog();
		//animal.eat();
		
		
		//downcasting
		M_UpcastingDowncasting_Animal a3 = new M_UpcastingDowncasting_Dog();
		a3.walk();
		M_UpcastingDowncasting_Dog d2 = (M_UpcastingDowncasting_Dog)a3;
		d2.walk();
		d2.sleep();
		
		
		//Runtime error: M_UpcastingDowncasting_Animal cannot be cast to M_UpcastingDowncasting_Dog
		M_UpcastingDowncasting_Animal a4 = new M_UpcastingDowncasting_Animal();
		//M_UpcastingDowncasting_Dog d3 = (M_UpcastingDowncasting_Dog)a4;
		//d3.walk();
		//d3.sleep();
		
		
	}

}
