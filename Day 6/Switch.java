import java.util.Scanner;

class Switch{
	
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-----Menu-----\n"+
						   "1.Addition\n"+
						   "2.Substraction\n"+
						   "3.Multiplication\n"+
						   "4.Division\n");
		System.out.print("Enter your Choice : ");
		int ch = scan.nextInt();
		
		switch(ch){
			
			case 1:
				System.out.print("Enter number 1: ");
				int n1 = scan.nextInt();
				System.out.print("Enter number 2: ");
				int n2 = scan.nextInt();
				System.out.println("Addition is "+(n1+n2));
				break;
				
			case 2:
				System.out.print("Enter number 1: ");
				int n3 = scan.nextInt();
				System.out.print("Enter number 2: ");
				int n4 = scan.nextInt();
				System.out.println("Substraction is "+(n3-n4));
				break;
				
			case 3:
				System.out.print("Enter number 1: ");
				int n5 = scan.nextInt();
				System.out.print("Enter number 2: ");
				int n6 = scan.nextInt();
				System.out.println("Multiplication is "+(n5*n6));
				break;
				
			case 4:
				System.out.print("Enter number 1: ");
				int n7 = scan.nextInt();
				System.out.print("Enter number 2: ");
				int n8 = scan.nextInt();
				System.out.println("Division is "+(n7/n8));
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Invalid Input!");
				break;
		
		}
		
	
	}
}
