import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,1,1,0,0,0,1,1,1,1,0};
		int arr1[]=arr;
		int len=arr.length;
		int count=0;
		int zerocount=0;
		int a=0;
		int k=2;
		int max=0;

		while(a<len){
	
			arr=arr1;

			for(int i=a;i<len;i++){

				if(arr[i]==0 && zerocount<k){

					arr[i]=1;
					zerocount++;
				}
				if(zerocount==k){

					a=i+1;
					zerocount=0;
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<len;i++){

				if(arr[i]==1){

					count++;
				}	
				if(count>max){

					max=count;
				}
				if(arr[i]==0){

					count=0;
				}
			}		
		}
		System.out.println(max);
	}
}