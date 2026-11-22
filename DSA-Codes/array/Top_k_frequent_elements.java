class Demo{

	public static void main(String[]args){

		int arr[]={1,2,1,2,1,2,3,1,3,2};
		int len=arr.length;
		int k=2;
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
		int index=0;
		for(int i=1;i<=k;i++){

			int max1=Integer.MIN_VALUE;
			for(int j=0;j<freq.length;j++){

				if(freq[j]>max1){

					index=j;
					max1=freq[j];
				}
			}
			System.out.println(index);
			freq[index]=0;
		}
	}
}