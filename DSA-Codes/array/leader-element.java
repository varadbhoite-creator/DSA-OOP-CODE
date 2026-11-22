class Demo{
	
	public static void main(String[]args){

		int arr[]={7};
		int len=arr.length;
		Boolean isleader=true;

		for(int i=0;i<len;i++){

			for(int j=i+1;j<len;j++){

				if(arr[i]<arr[j]){

					isleader=false;
					break;
				}
			}
			if(isleader){

				System.out.println(arr[i]);
			}
		isleader=true;
		}		
	}
}