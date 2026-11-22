class Demo{

	static int solution(int arr[]){

		int left=1;
		int right=arr.length-2;
		int index=0;

		while(left<=right){

			int mid=(right+left)/2;

			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){

				index=mid;
				break;
			}else if(arr[mid]<arr[mid-1]){

				right=mid-1;
			}else{

				left=mid+1;
			}
		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={1,2,1,3,5,6,4};		

		System.out.println(solution(arr));
	}
}