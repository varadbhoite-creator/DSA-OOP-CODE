class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:")		
		int num=sc.nextInt();
		Boolean isprime=true;

		for(int i=2;i<num;i++){

			if(num%a==0){

				isprime=false;
				break;
			}
		}	
		if(isprime){
			System.out.println(isprime);
		}else{
			System.out.println(isprime);
		}
	}
}