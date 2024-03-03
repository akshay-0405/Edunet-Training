import java.util.Scanner;
import Login.OtherPackage;

public class NonAccessLevel{
	
	public static void main(String []args){
		System.out.println("Number : "+n);
		show();
		Other.display();
	}
	
	static int n=181;
	static void show(){
		System.out.println("Shri Hanuman");
	}
}

class Other{
	static void display(){
		System.out.println("Shri Ram");
	}
}
