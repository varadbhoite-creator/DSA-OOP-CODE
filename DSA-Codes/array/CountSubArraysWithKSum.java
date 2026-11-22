class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,2,1};
		int len=arr.length;
		int count=0;
		int tar=5;

		for(int i=0;i<len;i++){	

			for(int j=i;j<len;j++){
		
				int sum=0;
				for(int k=i;k<=j;k++){

					sum=sum+arr[k];
				}
				if(sum==tar){

					count++;
				}
			}
		}
		System.out.println(count);
	}
}