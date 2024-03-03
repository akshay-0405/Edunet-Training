public class TypeCast{
	
	public static void main(String []args){
	
		//Widening - small to big - Implicit Conversion - Automatic Type Cast
		//byte -> short -> char -> int -> long -> float -> double.
	
		byte bnum=10; // 1 byte
		short snum=bnum; // 2 bytes
		int inum=snum; // 4 bytes
		double dnum=inum; // 8 bytes
		
		//Narrowing - big to small - Explicit Conversion - Manual Type Cast
		//double -> float -> long -> int -> char -> short -> byte.
		
		long longphno = 7559205988L;
		int intphno = (int)longphno;
		int x = 2147483647;
		byte y = (byte)x;
		char z = (char)x;
		System.out.println("Narrowing : "+y);
		System.out.println("Narrowing : "+z);
	
	}

}
