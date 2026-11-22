import java.util.*;
class Demo{

	static int solution(int arr[]){

		int max=0;
		int count=0;

		HashSet<Integer> hs=new HashSet<Integer>();

		for(Integer i:arr){

			hs.add(i);
		}
		System.out.println(hs);

		for(Integer i:hs){

			if(!hs.contains(i-1) ){

				count=1;
				if(count>max){

					max=count;
				}
			}else{

				count++;
				if(count>max){

					max=count;
				}
			}
		}
		return max;
	}

	public static void main(String[]args){

		int arr[]={0,-1,1,-2,2,-3,3};

		System.out.println(solution(arr));
	}
}