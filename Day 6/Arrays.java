class Arrays{
	public static void main(String []args){
		
		//Single Dimensional Arrays
		
		int [] num1 = {1,2,3,4,5,6,7};
		int [] num2 = new int[5];
		int [] num3 = new int[]{9,8,7};
		String cities[]={"Pune","Mumbai","Nagpur"};
		
		System.out.println("Cities Length : "+cities.length);
		
		System.out.print("Array 1 : ");
		for(int i : num1){
			System.out.print(i+" ");
		}
		System.out.print("\n");
		
		System.out.print("Array 2 : ");
		for(int i : num2){
			System.out.print(i+" ");
		}
		System.out.print("\n");
		
		System.out.print("Array 3 : ");
		for(int i : num3){
			System.out.print(i+" ");
		}
		System.out.print("\n");
		
		//2 Dimensional Arrays
		
		int [][] mularr = {{9,8,7,6},{5,4,3,2}};
		
		System.out.print("2D Array : \n");
		for(int i=0;i<mularr.length;i++){
			for(int j=0;j<mularr[0].length;j++){
				System.out.print(mularr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("\n");
		
	}
}
