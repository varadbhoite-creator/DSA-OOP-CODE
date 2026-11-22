class Demo{

	static int solution(int arr[],int n){

		int len=arr.length;
		int max2=Integer.MAX_VALUE;
		int largest=0;
	
		if(len>n){

		for(int i=1;i<=n;i++){

			int max1=Integer.MIN_VALUE;

			for(int j=0;j<len;j++){

				if(arr[j]>=max1 && arr[j]<max2){

					max1=arr[j];
				}
			}		
			max2=max1;
			largest=max1;
		}
		}else{
			
			int max1=Integer.MIN_VALUE;
			for(int j=0;j<len;j++){

				if(arr[j]>max1){

					max1=arr[j];
				}
			}
			largest=max1;
		}
		return largest;
	}
	
	public static void main(String[]args){

		int arr[]={1,2,3};
		int n=3;

		System.out.println(solution(arr,n));
	}
}