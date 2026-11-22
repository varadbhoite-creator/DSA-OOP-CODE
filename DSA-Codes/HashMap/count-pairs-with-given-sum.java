import java.util.*;
class Demo{

	static int solution(int arr[],int tar){

		int count=0;
		int n=arr.length;

		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

		for(int i=0;i<arr.length;i++){

			int find=tar-arr[i];

			if(!hm.containsKey(find)){

				hm.put(arr[i],i);
			}else{

				count++;
			}
		}
		return count;
	}

	public static void main(String[]args){

		int arr[]={1,1,1,1};
		int tar=2;

		System.out.println(solution(arr,tar));
	}
}