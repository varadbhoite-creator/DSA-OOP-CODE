import java.util.*;
class Demo{

	static int[] solution(int arr[]){

		int len=arr.length;
		int a=0;
		int newarr[]=new int[len];

		for(int i=0;i<len;i++){

			if(arr[a]==0){

				i=i+1;
				a++;
			}else{

				newarr[i]=arr[a];
				a++;
			}
		}
		return newarr;
	}

	public static void main(String[]args){

		int arr[]={1,2,3};

		System.out.println(Arrays.toString(solution(arr)));
	}
}