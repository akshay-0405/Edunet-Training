public class Recursion{

	static int x=0;
	
	public static void main(String []args){
		
		Hello();
	
	}
	
	static void Hello(){
		x++;
		if(x<5){
			System.out.println("Hello AK!");
			Hello();
		}
	}
}
