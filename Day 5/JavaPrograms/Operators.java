public class Operators{
	public static void main(String []args){

		//Arithmetic Operators
		int n1=50;
		int n2=10;

		int sum=n1+n2;
		int sub=n1-n2;
		int mul=n1*n2;
		int div=n1/n2;

		System.out.println("Arithmetic Operators : ");
		System.out.print(sum+" ");
		System.out.print(sub+" ");
		System.out.print(mul+" ");
		System.out.println(div+" ");

		System.out.println();

		//Assignment Operators
		int num=26;//26
		num+=10; //36
		num-=10; //26
		num*=2; //52
		num/=2; //26
		System.out.println("Assignment Operator : "+num);
		num=-10;
		System.out.println("Assignment Operator Updated : "+num);

		System.out.println();

		//Comparison Operator
		System.out.println("Comparison Operator : "+(25 > 5)); //>,<,>=,<=,==

		System.out.println();

		//Logical Operator
		boolean logic = (n1==50 && n2==10);
		System.out.println("Logical Operator : "+logic);

		System.out.println();

		//Unary Operators
		long n=10;
		n++; //++n
		n--; //--n
		System.out.println("Unary Operators : "+n);
	}
}
