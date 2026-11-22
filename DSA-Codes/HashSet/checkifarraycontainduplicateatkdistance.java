import java.util.*;
class Demo{


	static Boolean solution(int arr[],int k){

		HashSet<Integer> hs=new HashSet<Integer>();
		boolean contain=false;

		for(int i=0;i<arr.length;i++){


			if(i%k==0){

				contain=hs.contains(i);
			}
			hs.add(i);
		}
		return contain;
	}

	public static void main(String[]args){

		int arr[]={1,2,3,1,4,5};

		int k=3;

		System.out.println(solution(arr,k));
	}
}