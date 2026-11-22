import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr1[]={1,2,3,4,5,5};
		int arr2[]={3,4,5,6,7,3,5};

		HashMap<Integer,Integer> hm = new HashMap();

		for(Integer i:arr1){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(Integer i:arr2){

			if(hm.containsKey(i)){

				if(hm.get(i)>0){

					System.out.println(i);
					hm.put(i,hm.get(i)-1);
				}
			}
		}
	}
}