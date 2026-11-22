class Demo{

	public static void main(String[]args){

		int arr[]={15,-2,2,-8,1,7,10,23};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
				
				int sum=0;

				for(int k=i;k<=j;k++){

					sum=sum+arr[k];					
				}
				if(sum==0){

					if(j>max){

						max=j;
					}
				}
			}
		}
		System.out.println(max);
	}
}