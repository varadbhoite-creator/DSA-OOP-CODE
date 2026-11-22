import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target:");
		int arr[]={10,22,28,29,30,40};
		int len=arr.length;
		int target=sc.nextInt();
		int sum=0;
		int min=arr[0];
		int a=0;
		int b=0;

		for(int i=0;i<len;i++){

			for(int j=i+1;j<len;j++){

				sum=arr[i]+arr[j];

				int diff=target-sum;
				if(diff>=0){

					if(diff<min){

						min=diff;
						a=arr[i];
						b=arr[j];
					}
				}
			}
		}
		System.out.println(""+a+","+b);
	}
}