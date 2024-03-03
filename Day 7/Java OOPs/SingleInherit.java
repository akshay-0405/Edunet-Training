public class SingleInherit{
	
	public static void main(String []args){
	
		System.out.println("I'm From Main Class!");
		
		Akshay ak = new Akshay();
		ak.show();
		//Parent cannot access contents of Child Class
		//ak.display(); 
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+");
		
		Madhav md = new Madhav();
		md.show();
		md.display();
	
	}	
}

//Parent
class Akshay{
	
	void show(){
	
		System.out.println("I'm From Class Akshay!");
		
	}
}

//Child
class Madhav extends Akshay{
	
	@Override
	void show(){
	
		System.out.println("I'm Overrided & I'm From Class Madhav!");
		
	}
	
	void display(){
	
		System.out.println("I'm From Class Madhav!");
		
	}
}
