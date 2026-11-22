import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int count=0;
		Boolean isunique=false;
		int index=0;
		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			isunique=false;
			for(int j=0;j<len;j++){

				if(ch==s.charAt(j)){

					count++;
				}
			}
			if(count==1){

				isunique=true;
				index=i;
				break;

			}
			count=0;
		}
		System.out.println(index);
	}
}