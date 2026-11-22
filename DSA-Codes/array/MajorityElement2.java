class Demo{

	public static void main(String[]args){

		int arr[]={1,1,1,3,3,2,2,2};
		int len=arr.length;
		int max=0;
			
		for(int i=0;i<len;i++){
	
			int count=0;

			for(int j=i+1;j<len;j++){

				if(arr[i]==arr[j]){

					count++;
				}
			}
			if(count>=max){

				max=count;
				System.out.println(arr[i]);
			}
		}
	}
}