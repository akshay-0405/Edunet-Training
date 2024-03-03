import java.util.Scanner;

class For{
	
	public static void main(String []args){
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Table Number : ");
		 int n=scan.nextInt();
		 int num=1;
		 
		 for(int i=0;i<5;i++){
		 	
		 	int table = num*n;
		 	System.out.println(n+" * "+num+" = "+table);
		 	num+=2;
		 }
		 
		 for(int i=0;i<5;i++){
		 
		 	int m=5;
		 	m-=i;
		 	
		 	for(int j=0;j<m;j++){
		 		System.out.print("+");	
		 	}
		 	System.out.println("\n");
		 }
	}	
}
