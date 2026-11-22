import java.util.*;
class Demo{

	static int solution(int arr[]){

		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(Integer i:arr){

			if(!hs.contains(i)){

				hs.add(i);
			}else{

				hs.remove(i);
			}
		}
		int element=0;
		for(Integer i:arr){

			if(hs.contains(i)){

				element=i;
				break;
			}
		}		
		return element;	
	}

	public static void main(String[]args){

		int arr[]={3,4,5,1,2,1,4,5};

		System.out.println(solution(arr));
	}
}