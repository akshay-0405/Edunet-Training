public class MultipleInherit{
	
	public static void main(String []args){
		
		Human hn = new Human();
		hn.show();
		//Parent cannot access contents of Child Class
		//hn.display(); 
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+");
		
		Engineer eng = new Engineer();
		eng.show();
		eng.display();
		
		Student st = new Student();
		st.show();
		System.out.println(st.greet);
	
	}	
}

//Parent
class Human{

	String greet = "Jay Shri Ram";
	
	void show(){
	
		System.out.println("I'm Human!");
		
	}
}

//Child
class Engineer extends Human{
	
	@Override
	void show(){
	
		System.out.println("I'm Overrided & I'm Engineer!");
		
	}
	
	void display(){
	
		System.out.println("I'm Engineer!");
		
	}
}

class Student extends Human{
	
	void show(){
	
		System.out.println("I'm Student!");
		
	}
}
