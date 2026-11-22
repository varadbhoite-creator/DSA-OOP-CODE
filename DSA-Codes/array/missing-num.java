class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,7,9};
		int len=arr.length;

		for(int i=0;i<len;i++){

			if(arr[i]!=(i+1)){

				System.out.println(i+1);
				break;
			}
		}
	}
}