import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char arr[]=s.toCharArray();
		int len=arr.length;
		
		for(int i=0;i<len;i++){

			for(int j=0;j<len-1-i;j++){

				if(arr[j]>arr[j+1]){

					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		String s1=new String(arr);
		System.out.println(s1);
	}
}