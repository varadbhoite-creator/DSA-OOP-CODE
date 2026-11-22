class Demo{

	public static void main(String[]args){

		int arr[]={10,3,8,2,7,15,4};
		int len=arr.length;
		

		for(int i=1;i<len-1;i++){

			Boolean right=false;
			Boolean left=false;

			for(int j=i+1;j<len;j++){

				if(arr[j]>arr[i]){

					right=true;
					break;
				}
			}
			for(int j=0;j<i;j++){

				if(arr[j]>arr[i]){

					left=true;
					break;
				}
			}

			if(right && left){

				System.out.println(arr[i]);
			}
		}
	}
}