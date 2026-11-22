import java.util.*;
class Demo{

	static int[] solution(int arr[]){

		int len=arr.length;
		int j=0;	
		int k=1;
		int newarr[]=new int[len];


		for(int i=0;i<len;i++){

			if(arr[i]>=0){

				newarr[j]=arr[i];
				j=j+2;
			}else{

				newarr[k]=arr[i];
				k=k+2;
			}
		}
		return newarr;
	}
	
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){

			arr[i]=sc.nextInt();
		}

		System.out.println(Arrays.toString(solution(arr)));
	}
}