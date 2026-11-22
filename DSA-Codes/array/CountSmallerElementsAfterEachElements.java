class Demo{

	public static void main(String[]args){

		int arr[]={5,2,6,1};
		int len=arr.length;

		for(int i=0;i<len;i++){

			int count=0;

			for(int j=i+1;j<len;j++){

				if(arr[i]>arr[j]){

					count++;
				}
			}
			System.out.println(count);
		}
	}
}