class Demo{

	public static void main(String[]args){

		int arr[]={1,100,2,200,3,300,4};	
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			if(arr[i]>max){

				max=arr[i];
			}
		}	
	
		int freq[]=new int[max+1];

		for(int i=0;i<len;i++){

			freq[arr[i]]++;
		}

		int max1=0;
		int count=0;
		int len1=freq.length;

		for(int i=0;i<len1;i++){

			if(freq[i]==0){

				count=0;
			}else{

				count++;
				if(count>max1){

					max1=count;
				}
			}
		}
		System.out.println(max1);
	}
}