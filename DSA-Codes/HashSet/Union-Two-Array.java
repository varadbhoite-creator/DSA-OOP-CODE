import java.util.*;
class Demo{

	static HashSet<Integer> solution(int arr1[],int arr2[]){

		HashSet<Integer> hs=new HashSet<Integer>();

		ArrayList<Integer> al=new ArrayList<Integer>();

		for(Integer i:arr1){

			hs.add(i);
		}

		for(Integer i:arr2){

			hs.add(i);
		}
		return hs;
	}

	public static void main(String[]args){

		int arr1[]={1,2,3,4};
		int arr2[]={3,4,5,6};

		System.out.println(solution(arr1,arr2));
	}
}