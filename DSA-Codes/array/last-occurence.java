class Demo{

	public static void main(String[]args){

		int arr[]={5,8,3,8,2,};
		int len=arr.length;
		int tar=8;
		int lastoccurence=0;

		for(int i=0;i<len;i++){

			if(arr[i]==tar){

				lastoccurence=i;
			}
		
		}
		System.out.println(lastoccurence);
	}
}