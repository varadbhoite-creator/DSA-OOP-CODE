class Demo{

	public static void main(String[]args){

		int arr[]={2,3,4,6,7,8,9};
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				System.out.println(i);
			}
		}
	}
}