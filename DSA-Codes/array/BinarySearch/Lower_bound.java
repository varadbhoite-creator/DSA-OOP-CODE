class Demo{

	static int solution(int arr[],int tar){

		int left=0;
		int right=arr.length-1;
		int index=arr.length;

		while(left<=right){

			int mid=(right+left)/2;

			if(arr[mid]>=tar){

				right=mid-1;
				if(arr[mid]>=tar){

					index=mid;
				}
			}else{

				left=mid+1;
			}
		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={};
		int tar=5;

		System.out.println(solution(arr,tar));
	}
}