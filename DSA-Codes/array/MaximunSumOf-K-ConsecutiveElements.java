import java.util.*;
class Demo{

	public static void main(String[]args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter k:");
		int arr[]={2,1,5,1,3,2};
		int len=arr.length;
		int k=sc.nextInt();
		int max=0;
		int sum=0;

		for(int i=0;i<=len-k;i++){

			sum=arr[i];
			for(int j=i+1;j<i+k;j++){

				sum=sum+arr[j];
			}
			if(sum>max){

				max=sum;
			}
		}
		System.out.println(max);
	}
}