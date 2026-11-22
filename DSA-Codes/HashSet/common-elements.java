import java.util.*;
class Demo{

	static ArrayList<Integer> solution(int arr1[],int arr2[]){

		HashSet<Integer> hs=new HashSet<Integer>();
	
		ArrayList<Integer> al=new ArrayList<Integer>();

		for(Integer i:arr1){

			hs.add(i);
		}

		for(Integer i:arr2){

			if(hs.contains(i)){

				al.add(i);
			}
		}
		return al;
	}

	public static void main(String[]args){

		int arr1[]={1,2,3,4,5,6};
		int arr2[]={3,4,5,6,7,8};

		System.out.println(solution(arr1,arr2));
	}
}