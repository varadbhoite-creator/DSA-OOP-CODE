import java.util.*; 
class Demo{

	public static void main(String[]args){

		int arr[]={3,6,8,9,12};
		int len=arr.length;
		int key=3;
		int count=0;

		for(int i=0;i<len;i++){

			if(arr[i]%key==0){

				count++;
			}
		}
		int newarr[]=new int[count];
		int j=0;
		for(int i=0;i<len;i++){

			if(arr[i]%key==0){

				newarr[j]=arr[i];
				j++;
					
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}