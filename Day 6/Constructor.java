public class Constructor{

	//Parameterised
	//Default
	//Non-Parameterised

	public static void main(String []args){
		
		Akshay ak = new Akshay();//Default
		ak.greet();
		
		System.out.println("Your Age is "+ak.age);
		
		Akshay k = new Akshay(1000000);
		
		System.out.println("Your Salary is "+k.sal);
		
	}
}

class Akshay{

	int age;
	int sal;
	
	Akshay(){ //Non-Parameterised
		age=10;
	}
	
	Akshay(int x){ //Parameterised
		this.sal=x;
	}

	void greet(){
		System.out.println("Hello AK");
	}
}
