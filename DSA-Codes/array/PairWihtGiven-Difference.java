import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter k:");
		int arr[]={1,5,3,4,2};
		int len=arr.length;
		int k=sc.nextInt();
		
	
		for(int i=0;i<len;i++){

			int sum=arr[i]+k;
			for(int j=0;j<len;j++){

				if(sum==arr[j]){

					System.out.println(""+"["+arr[i]+","+arr[j]+"]");
				}
			}
		}
	}
}