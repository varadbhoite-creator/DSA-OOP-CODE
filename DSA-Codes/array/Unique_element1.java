class Demo{

	public static void main(String[]args){

		int arr[]={2,3,5,4,5,3,4};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
	
		for(int i=0;i<len;i++){

			if(arr[i]>max){

				max=arr[i];
			}
		}
		int freq[]=new int[max+1];
		for(int i=0;i<len;i++){

			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++){

			if(freq[i]==1){

				System.out.println(i);
			}
		}
	}
}