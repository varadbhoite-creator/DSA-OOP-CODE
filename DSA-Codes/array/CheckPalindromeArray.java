class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,2};
		int len=arr.length;
		Boolean ispalindrome=true;
		int left=0;
		int right=len-1;

		while(left<right){

			if(arr[left]!=arr[right]){

				ispalindrome=false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(ispalindrome);
	}
}