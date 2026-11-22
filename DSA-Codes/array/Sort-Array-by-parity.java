import java.util.*;
class Demo{

	static int[] solution(int arr[]){

		int len=arr.length;
		int newarr[]=new int[len];
		int j=0;
		int k=len-1;

		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				newarr[j]=arr[i];
				j++;
			}else{

				newarr[k]=arr[i];
				k--;
			}
		}
		return newarr;
	}

	public static void main(String[]args){

		int arr[]={3,1,2,4};

		System.out.println(Arrays.toString(solution(arr)));
	}
}