import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int left=0;
		int right=len-1;
		Boolean valid=false;

		while(left<right){
		
	
		int ch=s.charAt(left);
		ch=ch+2;
		int ch1=s.charAt(right);

			if(ch==ch1){
				
				System.out.println(valid);
				valid=false;
				break;
				
			}
			left++;
			right--;
		}
		if(valid){

			System.out.println("valid");
		}else{

			System.out.println("Invalid");
		}
	}
}