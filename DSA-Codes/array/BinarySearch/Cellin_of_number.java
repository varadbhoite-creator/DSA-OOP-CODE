class Demo{

	static int solution(int arr[],int tar){

		int left=0;
		int right=arr.length-1;
		int index=-1;

		while(left<=right){

			int mid=(left+right)/2;

			if(arr[mid]>=tar){
	
				right=mid-1;
				if(arr[mid]>=tar){

					index=arr[mid];
				}			
			}else{

				left=mid+1;

				if(arr[mid]>=tar){

					index=arr[mid];
				}
			}
		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={10,20,30,40,50};
		int tar=10;

		System.out.println(solution(arr,tar));
	}
}