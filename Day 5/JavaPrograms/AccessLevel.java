import java.util.Scanner;
import Login.OtherPackage;

public class AccessLevel{

	//Applied on : 
	//class
	//variable
	//method
	
	//4 Access Modifiers :
	//1. default
	//2. public
	//3. protected
	//4. private
	
	
	public static void main(String []args){
	
			AccessLevel obj1 = new AccessLevel();
			System.out.println("Number "+obj1.num);
			obj1.show();
			
			//Other obj2 = new Other();
			
			OtherPackage obj2 = new OtherPackage();
			obj2.Greet();
	}
	
	private int num=25;
	void show(){
		System.out.println("Shri Ram");
	}
}

/*class Other{
	private void (String []args){
		System.out.println("Shri Ram");
	}
}*/
