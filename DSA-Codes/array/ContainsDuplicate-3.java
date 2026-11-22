class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		int indexdiff=1;
		int valuediff=1;
		Boolean found=false;

		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				if((j-i)<=indexdiff){

					if((arr[j]-arr[i])<=valuediff && (arr[j]-arr[i])>=0){

						found=true;
						break;
					}
				}
			}
		}
		System.out.println(found);
	}
}