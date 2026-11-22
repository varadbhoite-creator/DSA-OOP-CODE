import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int foundcount=0;
		int count=0;	
		int max=0;

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			for(int j=i;j<len;j++){

				if(ch==s.charAt(j)){

					foundcount++;
					count++;
				}else{

					break;
				}
			}
			if(foundcount>max){

				max=foundcount;
			}
			i=count-1;
			foundcount=0;
		}
		System.out.println(max);
	}
}