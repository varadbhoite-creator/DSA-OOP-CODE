import java.util.*;
class Demo{

	static ArrayList<Integer> solution(int arr1[],int arr2[]){

		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(Integer i:arr1){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		
		for(Integer i:arr2){

			if(hm.containsKey(i)){

				al.add(i);
				hm.remove(i);
			}
		}

		return al;
	}
	
	public static void main(String[]args){

		int arr1[]={1,2,3,4,5,6};
		int arr2[]={4,5,6,7,8,5};

		System.out.println(solution(arr1,arr2));
	}
}