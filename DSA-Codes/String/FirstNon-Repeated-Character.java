import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");	
		String s=sc.next();
		int len=s.length();
		int count=0;

		for(int i=0;i<len;i++){
			
			char ch=s.charAt(i);

			for(int j=0;j<len;j++){
				
				char cha=s.charAt(j);

				if(ch==cha){

					count++;

				}
			}
			if(count==1){

				System.out.println(s.charAt(i));
				break;
			}
			count=0;
		}
	}
}