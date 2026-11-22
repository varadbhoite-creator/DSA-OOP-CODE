class Demo{

	static int solution(int arr[],int tar){

		int left=0;
		int right=arr.length-1;
		int index=arr.length;

		while(left<=right){

			int mid=(right+left)/2;

			if(arr[mid]>tar){

				if(arr[mid]>tar){

					index=mid;
				}
				right=mid-1;
			}else{

				left=mid+1;
			}
		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={10,20,30,40};
		int tar=30;

		System.out.println(solution(arr,tar));
	}
}