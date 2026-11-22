class Demo{

	public static void main(String[]args){

		int arr[]={3,1,4,2};
		int len=arr.length;
		int max=arr[0];
		int t=3;

		for(int i=0;i<t;i++){

			for(int j=i;j<len;j++){

				for(int k=i;k<=j;k++){

					if(arr[k]<max){

						max=arr[k];
					}
				}
				System.out.println(max);
				max=arr[0];
			}
		}
	}
}