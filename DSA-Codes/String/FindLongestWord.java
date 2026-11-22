import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		int max=0;
		String word="";
		for(int i=0;i<len;i++){

			String s1=new String(arr[i]);
			int s1len=s1.length();
			
			if(s1len>max){

				max=s1len;
				word=s1;
			}
		}
		System.out.println(word);
	}
}