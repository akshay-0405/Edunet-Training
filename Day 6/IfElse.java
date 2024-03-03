import java.util.Scanner;

public class IfElse{

	public static void main(String []args){
	
		Scanner scan = new Scanner(System.in);
	
	 	System.out.println("Enter Your Percentage : ");
	 	int p = scan.nextInt();
	 	
	 	if( p >= 90 && p <= 100 ){
	 		System.out.println("A Grade.");
	 	}
	 	else if( p >= 80 && p < 90 ){
	 		System.out.println("A Grade.");
	 	}
	 	else{
	 		System.out.println("Fail!.");
	 	}
	 	
	 	String Greet = (p==100)?"Excellent!":"Keep it Up!"; //Ternary Operator
	 	System.out.println(Greet);
	}
}
