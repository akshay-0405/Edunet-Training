public class Polymorph{
	
	//Overloading - same method name with different parameters
	//Different return types & parameters accepted
	
	public static void main(String []args){
	
		//Overloading Calls
		sum(10,20);
		sum(1.1f,2.2f);
		System.out.println(sum());
		
		//Overriding Calls
		
		Animal obj = new Animal();
		obj.display();
		
		Prasad cow = new Prasad();
		cow.display();
	
	}	
	
	//Overloaded Functions
	static void sum(int int1, int int2){
	
		System.out.println("Integer addition = "+(int2+int1));
	
	}
	
	static void sum(float f1, float f2){
	
		System.out.println("Float addition = "+(f2+f1));
	
	}
	
	static double sum(){
		System.out.println("Double");
		return 0.0;
	}
	
}

//Overrided Functions
class Animal{
	
	void display(){
		
		System.out.println("I'm from Animal Class!");
		
	}
		
}

class Prasad extends Animal{

	@Override
	void display(){
		
		System.out.println("I'm Prasad & I'm from Animal Class!");
		
	}

}
