import java.util.*;
class Demo{

	static ArrayList<Integer> solution(int arr1[],int arr2[]){

		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();

		for(Integer i:arr1){

			hm.putIfAbsent(i,i);
		}

		for(Integer i:arr2){

			hm.putIfAbsent(i,i);
		}

		for(Integer i:arr1){

			if(hm.containsKey(i)){

				al.add(hm.get(i));
				hm.remove(i);

			}			
		}

		for(Integer i:arr2){

			if(hm.containsKey(i)){

				al.add(hm.get(i));
				hm.remove(i);
			}
		}
		
		return al;
	}
	
	public static void main(String[]args){

		int arr1[]={1,2,1,3,4};
		int arr2[]={3,4,5,6,5,4,3};

		System.out.println(solution(arr1,arr2));
	}
}