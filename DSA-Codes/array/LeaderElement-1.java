class Demo{

	public static void main(String[]args){

		int arr[]={16,17,4,3,5,2};
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			Boolean leader=true;
			for(int j=i+1;j<len;j++){

				if(arr[i]<arr[j]){

					leader=false;
					break;
				}
			}
			if(leader){

				System.out.println(arr[i]);
			}
		}
	}
}