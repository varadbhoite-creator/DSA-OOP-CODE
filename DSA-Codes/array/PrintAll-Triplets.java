class Demo{

	public static void main(String[]args){

		int arr[]={-1,0,1,2,-1,-4};
		int len= arr.length;
		
		for(int i=0;i<len-2;i++){

			for(int j=i+1;j<len-1;j++){

				for(int k=j+1;k<len;k++){

					System.out.println(""+arr[i]+","+arr[j]+","+arr[k]);
				}
			}
		}
	}
}