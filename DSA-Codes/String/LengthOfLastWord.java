import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		int count=0;

		for(int i=0;i<1;i++){	

			String s1=arr[len-1];

			for(int j=0;j<s1.length();j++){

				count++;
			}
		}
		System.out.println(count);
	}
}