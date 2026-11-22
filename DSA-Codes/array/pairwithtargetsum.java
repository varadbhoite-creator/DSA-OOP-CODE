class Demo{

	public static void main(String[]args){

		int arr[]={2,4,3,5,7,6,5,8};
		int len=arr.length;
		int tar=10;

		for(int i=0;i<len;i++){

			for(int j=i+1;j<len;j++){

				if((arr[i]+arr[j])==tar){

					System.out.println(""+arr[i]+","+arr[j]);
				}
			}
		}
	}
}