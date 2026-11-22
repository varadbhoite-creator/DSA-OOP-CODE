class Demo{

	public static void main(String[]args){

		int arr[]={4,5,6,5,4,4,7,5};
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

			int count=freq[i];

			for(int j=0;j<count;j++){

				System.out.print(i+" ");
			}
		}
	}
}