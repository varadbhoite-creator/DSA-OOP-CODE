import java.util.*;
class Demo{

	static Boolean solution(int arr1[],int arr2[]){

		HashSet<Integer> hs=new HashSet<Integer>();

		if(arr1.length!=arr2.length){

			return false;	
		}else{
			for(Integer i:arr1){

				hs.add(i);
			}

			for(Integer i:arr2){

				if(hs.contains(i)){

					hs.remove(i);
				}
			}

			return hs.isEmpty();
		}
	}

	public static void main(String[]args){

		int arr1[]={1,2,3,4};
		int arr2[]={4,3,2,1};

		System.out.println(solution(arr1,arr2));
	}
}