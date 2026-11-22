class Demo{

	public static void main(String[]args){

		int arr[]={1,2,2,3,4,4,5};
		int len=arr.length;
		int count=0;
		int foundcount=0;
		Boolean isfound=false;

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
				System.out.println(arr[i]+"="+count);
			}
			isfound=false;
			count=0;
			foundcount=0;
		}
	}
}