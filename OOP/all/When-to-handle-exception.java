class Demo{

	public static void main(String[]args){

		try{

			Scanner sc=new Scanner(System.in);	
			int a=sc.nextInt();
			System.out.println(10/a);	
		}catch(ArithmeticException e){

			System.out.println("catched");
		}
	}
}