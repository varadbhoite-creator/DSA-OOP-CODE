class Demo{

	public static void main(String[]args){

		int arr[]={3,6,8,5,10,11,12};
		int len=arr.length;
	
		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				System.out.println(arr[i]);
			}
		}
	}
}