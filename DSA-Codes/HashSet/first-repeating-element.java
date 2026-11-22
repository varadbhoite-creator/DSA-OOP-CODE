import java.util.*;
class Demo{

	static int solution(int arr[]){

		HashSet<Integer> hs=new HashSet<Integer>();
		int element=0;
		for(Integer i:arr){

			if(!hs.contains(i)){

				hs.add(i);
			}else{

				element=i;
				break;
			}
		}
		return element;
	}
	public static void main(String[]args){

		int arr[]={5,3,4,3,5,6};

		System.out.println(solution(arr));
	}
}