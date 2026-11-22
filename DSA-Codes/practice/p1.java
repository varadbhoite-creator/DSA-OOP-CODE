import java.util.*;
class Demo{

	static void solution(int arr[],int tar){

		int len=arr.length;
		
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				int sum=0;
				ArrayList al=new ArrayList();

				for(int k=i;k<=j;k++){

					sum=sum+arr[k];
				}	
				if(sum==tar){

					for(int k=i;k<=j;k++){

						al.add(arr[k]);
					}
					System.out.println(al);
				}
			}
		}
	}
	
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter tar:");
		int tar=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr array:");
		for(int i=0;i<n;i++){

			arr[i]=sc.nextInt();
		}

		solution(arr,tar);
	}
}