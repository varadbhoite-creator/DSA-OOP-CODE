import java.util.*;
class Demo{

	static ArrayList<Integer> solution(int arr[],int tar){

		ArrayList<Integer> al=new ArrayList<Integer>();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

		int len=arr.length;

		for(int i=0;i<len;i++){

			int find=tar-arr[i];

			if(!hm.containsKey(find)){

				hm.put(arr[i],i);
			}else{

				al.add(hm.get(find));
				al.add(i);
				break;
			}
		}
		return al;
	}
	
	public static void main(String[]args){

		int arr[]={5,5,5,5,5};
		int tar=10;

		System.out.println(solution(arr,tar));
	}
}