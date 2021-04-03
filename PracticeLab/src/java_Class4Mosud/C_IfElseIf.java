package java_Class4Mosud;

public class C_IfElseIf {

	public static void main(String[] args) {
		
		int speed =6;
		
		if(speed>65) {
			
			System.out.println("Driver is going over the speed limit.");
			
        }else if(speed <25 && speed<65) {
			
			System.out.println("Driver's liscense will be revoked.");
			
		}else if(speed <65) {
			
			System.out.println("Driver is going below the speed limit.");
				
		}else {
			
			System.out.println("Driver follows the rules.");
		}

	}

}
