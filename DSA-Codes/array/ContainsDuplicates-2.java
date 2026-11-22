class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,1,2,3};
		int k=1;
		int len=arr.length;
		Boolean distinct=false;

		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				if(arr[i]==arr[j]){

					if(j-i<=k){

						distinct=true;
						break;
					}
				}
			}
		}
		System.out.println(distinct);
	}
}