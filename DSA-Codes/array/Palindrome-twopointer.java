import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,1};
		int len=arr.length;
		int right=0;
		int left=len-1;
		Boolean ispalindrome=false;

		while(left<right){

			if(arr[left]==arr[right]){

				ispalindrome=true;
				left++;
				right--;
			}else{

				ispalindrome=false;
				break;
			}
		}
		System.out.println(ispalindrome);
	}
}