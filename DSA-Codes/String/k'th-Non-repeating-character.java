import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int count3=0;
		int k=sc.nextInt();
	
		for(int i=0;i<len;i++){
			int count1=0;
			int count2=0;
			char ch=s.charAt(i);

			for(int j=0;j<len;j++){

				if(ch==s.charAt(j)){

					count1++;
				}
			}
			for(int j=0;j<i;j++){

				if(ch==s.charAt(j)){

					count2++;
				}
			}
			if(count2==0){

				if(count1==1){

					count3++;
				}
			}
			if(count3==k){

				System.out.println(ch);
				break;
			}
		}
	
	}
}