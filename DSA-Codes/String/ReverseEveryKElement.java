import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int []arr={1,2,3,4,5,6};
		int len=arr.length;
		int k=sc.nextInt();
		
		for(int i=0i<len;i++){

			int left=i;
			int right=i+k-1;

			while(lest<right){

				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;

				left++;
				right--;
			}
			i=i+k-1;
		}
	}
}