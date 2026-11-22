class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int min=Integer.MAX_VALUE;
		

		for(int i=0;i<len-1;i++){

			int sum=arr[i]+arr[i+1];

			if(sum<min){

				min=sum;
			}
		}
		return min;
	}

	public static void main(String[]args){

		int arr[]={4,7,2,9,5,8};
		
		System.out.println(solution(arr));
	}
}