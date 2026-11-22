class Demo{

	public static void main(String[]args){

		int num=132435261;
		int num1=num/10;
		int count=0;

		while(num1>0){

			int rem=num1%10;
			num1=num1/10;

			int rem1=num1%10;
			int rem2=num%10;
			num=num/10;

			if(rem>rem1 && rem>rem2){
				count++;
			}
		}
		System.out.println(count);
	}
}