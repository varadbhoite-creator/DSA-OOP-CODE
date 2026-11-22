class Demo{

	public static void main(String[]args){

		int arr[]={15,10,12,8,9,5,7};
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			Boolean smaller=true;

			for(int j=0;j<i;j++){

				if(arr[i]>arr[j]){

					smaller=false;
					break;
				}
			}
			if(smaller){

				System.out.println(arr[i]);
			}
		}
	}
}