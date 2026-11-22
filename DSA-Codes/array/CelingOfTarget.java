class Demo{

	public static void main(String[]args){

		int arr[]={1,2,4,6,10,12};
		int len=arr.length;
		int min=arr[len-1];
		int celing=0;
		int tar=3;

		for(int i=0;i<len;i++){

			int diff=arr[i]-tar;
			if(diff<min && diff>=0){
				min=diff;
				celing=arr[i];
			}
		}
		System.out.println(celing);
	}
}