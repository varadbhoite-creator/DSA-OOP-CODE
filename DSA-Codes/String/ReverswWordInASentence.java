import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		int left=0;
		int right=len-1;
		
		while(left<right){

			String temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		
			left++;
			right--;
		}
		String s1="";
		for(int i=0;i<len;i++){

			s1=s1+arr[i]+" ";
		}
		s1=s1.trim();
		System.out.println(s1);
	}
}