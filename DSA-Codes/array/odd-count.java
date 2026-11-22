class Demo{

	public static void main(String[]args){

		int arr[]={2,5,8,9,10};
		int len=arr.length;
		int count=0;

		for(int i=0;i<len;i++){

			if(arr[i]%2!=0){

				count++;
				
			}
		}
		System.out.println(count);
	}
}