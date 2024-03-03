public class Parameters{
	
	static int n1; //Instance Variable
	static int n2; 
	
	public static void main(String []args){
		
		show();
		n1=10;
		n2=24;
		System.out.println("Addition : "+add(10,24));
		System.out.println("Division : "+Division.div(24,10));
		
		Display obj = new Display();
		obj.Greet("Akshay");
			
	}
	
	static void show(){
		System.out.println("Jay Shri Ram");
	}
	
	static double add(int x, int y){
		return x+y;
	}
}

class Division{
	static int div(int a,int b){
		return a/b;
	}
}

class Display{
	void Greet(String name){
		System.out.println("Hello "+name+"!");
	}
}
