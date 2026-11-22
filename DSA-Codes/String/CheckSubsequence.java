import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		System.out.println("Enter Subsequence:");
		String subsequence=sc.next();
		int slen=s.length();
		int subsequencelen=subsequence.length();
		boolean issubsequence=false;

		for(int i=0;i<slen;i++){
			
			char ch=s.charAt(i);
			issubsequence=false;
			for(int j=0;j<subsequencelen;j++){

				if(ch==subsequence.charAt(j)){

					issubsequence=true;
					j=j+1;
					break;
				}
			}
			if(issubsequence==false){

				break;
			}		
			i=i+1;	
		}
		System.out.println(issubsequence);
	}
}