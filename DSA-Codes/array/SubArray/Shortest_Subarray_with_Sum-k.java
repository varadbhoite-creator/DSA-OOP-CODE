class Demo{

	public static void main(String[]args){

		int arr[]={84,-37,32,40,95};
		int len=arr.length;
		int shortest=len;
		int k=167;
	
		for(int i=0;i<len;i++){

			int sum=0;
			int count=0;

			for(int j=i;j<len;j++){

				count++;
				sum=sum+arr[j];
				if(sum==k){

					if(count<shortest){

						shortest=count;
					}
				}
			}
		}
		System.out.println(shortest);
	}
}