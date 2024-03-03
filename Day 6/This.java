public class This{

	//

	int n1;
	int n2;
	
	This(int n1,int n2){
	
		this.n1 = n1;
		this.n2 = n2;
	
	}
	
	public static void main(String []args){
	
		This obj = new This(25,60);
		System.out.println(obj.n1);
		System.out.println(obj.n2);
	
	}	
}
