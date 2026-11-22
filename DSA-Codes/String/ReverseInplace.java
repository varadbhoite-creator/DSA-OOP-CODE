import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		int i=0;
		int j=len-1;

		while(i<j){

			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			i++;
			j--;
		}
		String s1=new String(arr);
		System.out.println(s1);
	}
}