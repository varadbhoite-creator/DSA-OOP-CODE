class Demo{

	public static void main(String[]args){

		int arr[]={1,2,2,3,4,4,5,6,6};
		int len=arr.length;
		int count=0;

		for(int i=0;i<len;i++){

			for(int j=i+1;j<len;j++){
	
				if(arr[i]==arr[j]){

					count++;	
				}
			}
			if(count==1){

				System.out.println(arr[i]);
			}
			count=0;
		}
	}
}