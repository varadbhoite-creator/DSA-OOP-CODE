class Demo{

	static void solution(int arr[]){

		int len=arr.length;
		
		for(int i=0;i<len;i++){

			int sum=arr[i];

			for(int j=0;j<i;j++){

				sum=sum+arr[j];
			}
			System.out.print(sum+" ");
		}
	}

	public static void main(String[]args){

		int arr[]={3,1,2,10,1};

		solution(arr);
	}
}