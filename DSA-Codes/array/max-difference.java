class Demo{

	public static void main(String[]args){

		int arr[]={9,4,3,2,1};
		int len=arr.length;
		int max=0;
		int diff=0;

		for(int i=0;i<len;i++){

			for(int j=0;j<len;j++){

				diff=arr[i]-arr[j];
				if(diff>max){
					max=diff;
				}
			}
		}
		System.out.println(max);
	}
}