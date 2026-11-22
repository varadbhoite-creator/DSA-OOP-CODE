class Demo{

	public static void main(String[]args){

		int arr[]={4,18,8,10,16};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				if(arr[i]>max){

					max=arr[i];
				}
			}
		}
		System.out.println(max);
	}
}