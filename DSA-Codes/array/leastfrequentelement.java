class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,2,5,2,4};
		int len=arr.length;
		int count=0;
		int foundcount=0;
		Boolean isfound=false;
		int min=arr[len-1];
		int element=0;

		for(int i=0;i<len;i++){

			for(int j=0;j<len;j++){

				if(arr[i]==arr[j]){
					
					count++;
				}
			}
			for(int k=0;k<=i;k++){
				
				if(arr[i]==arr[k]){

					foundcount++;
				}
			}
			if(foundcount==1){
				isfound=true;
			}
			if(isfound){

				if(count<min){
					min=count;
					element=arr[i];
				}
			}
			isfound=false;
			count=0;
			foundcount=0;	
		}
		System.out.println(element);
	}
}