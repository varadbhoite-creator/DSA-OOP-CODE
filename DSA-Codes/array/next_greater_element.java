class Demo{

	public static void main(String[]args){

		int arr[]={2,1,2,4,3};
		int len=arr.length;
		int element=0;
	
		for(int i=0;i<len;i++){
	
			Boolean greater=false;
			for(int j=i+1;j<len;j++){

				if(arr[j]>arr[i]){

					greater=true;
					element=arr[j];
					break;
				}
			}
			if(greater){

				System.out.println(element);
			}else{

				System.out.println("-1");
			}
		}
	}
}