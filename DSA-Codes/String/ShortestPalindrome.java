import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		StringBuffer sb2=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer();
		String s1=new String(sb2.reverse());
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=len-1;i>=0;i--){
		
			if(s.equals(s1)){
			
				System.out.println(s);
				break;


			}else{

			sb1.append(s.charAt(i));
			StringBuffer sb3=new StringBuffer();
			sb3.append(sb1);
			sb3.append(sb);
			int len1=sb3.length();
			Boolean palindrome=true;
	
			int left=0;
			int right=len1-1;

			while(left<right){

				if(sb3.charAt(left)!=sb3.charAt(right)){
	
					palindrome=false;
					break;
				}
				left++;
				right--;
			}
			if(palindrome==true){

				System.out.println(sb3.toString());
				break;
			}
			}
		}
	}
}