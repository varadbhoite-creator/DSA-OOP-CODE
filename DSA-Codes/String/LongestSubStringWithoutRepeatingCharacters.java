import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int count=0;
		int foundcount=0;

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			for(int j=0;j<=i;j++){

				if(ch==s.charAt(j)){

					foundcount++;
				}
			}
			if(foundcount==1){

				count++;
			}
			foundcount=0;
		}
		System.out.println(count);
	}
}