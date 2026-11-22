import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s1:");
		String s1=sc.next();
		System.out.println("Enter s2:");
		String s2=sc.next();

		int len1=s1.length();
		int len2=s2.length();
		int count=0;

		for(int i=0;i<len1;i++){

			char ch=s1.charAt(i);

			for(int j=0;j<len2;j++){
	
				char ch1=s2.charAt(j);
				if(ch==ch1){

					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}