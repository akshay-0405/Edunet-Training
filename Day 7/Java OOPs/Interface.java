public class Interface{
	
	//Each & every Methods declared in interface class should be overrided
	public static void main(String []args){
	
		
	
	}	
	
}

interface Fruits{

	void show();

}

interface Vegetables{

	void display();

}

class Mango{
	
	void show(){
		
		System.out.println("I'm Mango!");		
		
	}	
	
}

class Tomato implements Fruits,Vegetables{
	
	void display(){
	
		System.out.println("I'm Tomato!");
	
	}
	
}
