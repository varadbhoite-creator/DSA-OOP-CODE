class Demo{

	static void solution(int arr[]){

		int len=arr.length;
		
		for(int i=0;i<len;i++){

			int ele=-1;
		
			for(int j=i-1;j>=0;j--){

				if(arr[j]>arr[i]){

					ele=arr[j];
					break;
				}
			}
			System.out.println(ele);
		}
	}

	public static void main(String[]args){

		int arr[]={4,5,2,10};	

		solution(arr);
	}
}