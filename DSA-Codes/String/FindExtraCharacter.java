import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		
		for(int i=0;i<len2;i++){
			
			Boolean found=false;
			char ch=s2.charAt(i);
			for(int j=0;j<len1;j++){

				if(ch==s1.charAt(j)){

					found=true;
					break;
				}
			}
			if(found==false){

				System.out.println(ch);
				break;
			}
		}
	}
}