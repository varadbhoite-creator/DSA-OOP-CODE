class Demo{

	public static void main(String[]args){

		int n=2;
		int num=9;
		int k=18;

		for(int i=1;i<=k;i++){

			if(i%2==0){

				System.out.print(num*num*num+",");
				num--;
			}else{

				System.out.print(n+",");
				n=n+2;
			}
		}
	}
}