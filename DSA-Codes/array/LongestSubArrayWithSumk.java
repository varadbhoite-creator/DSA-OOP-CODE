class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,1,1,1};
		int tar=3;
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
		
				int sum=0;
				int count=0;
				for(int k=i;k<=j;k++){

					sum=sum+arr[k];
					count++;
				}
				if(sum==tar){

					if(count>max){

						max=count;
					}
				}
			}
		}
		System.out.println(max);
	}
}