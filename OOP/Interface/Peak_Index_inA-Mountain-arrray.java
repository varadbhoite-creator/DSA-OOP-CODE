class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int left=1;
		int right=len-2;
	
		while(left<=right){

			int mi(right+left)/2;

			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){

				return mid;
			}else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){

				right=mid-1;
			}else{

				left=mid+1;
			}
		}
	}

	public static void main(String[]args){

		int arr[]={0,1,0};

		System.out.println(solution(arr));
		
	}
}