class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int count=1;
		
		for(int i=0;i<len;i++){

			int ele=arr[i];
			int max=0;
			int index=0;

			for(int j=i+1;j<=i+ele;j++){

				if(arr[j]>max && arr[j]<len){

					max=arr[j];
					index=j;
				}
			}
			if(index==len-1){

				break;
			}else{

				i=index-1;
				count++;
			}
		}
		return count;
	}

	public static void main(String[]args){

		int arr[]={2,3,0,1,4};


		System.out.println(solution(arr));
	}
}