class Demo{

	static void solution(int arr[]){

		int len=arr.length;

		for(int i=0;i<len;i++){

			int count=1;

			for(int j=i-1;j>=0;j--){

				if(arr[i]>arr[j]){

					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static void main(String[]args){

		int arr[]={100,80,60,70,60,75,85};

		solution(arr);
	}
}