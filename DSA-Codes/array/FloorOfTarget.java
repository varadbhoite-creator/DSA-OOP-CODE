class Demo{

	public static void main(String[]args){

		int arr[]={1,2,4,6,10,12};
		int len=arr.length;
		int floor=0;
		int min=arr[len-1];
		int tar=7;

		for(int i=0;i<len;i++){

			int diff=tar-arr[i];
			if(diff<min && diff>=0){
				min=diff;
				floor=arr[i];
			}
		}
		System.out.println(floor);
	}
}