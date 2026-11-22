import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		int len=s.length();
		int count=0;
		int foundcount=0;
		
		for(int i=0;i<len;i++){

			for(int j=0;j<len;j++){

				if(s.charAt(i)==s.charAt(j)){

					count++;
				}
			}
			for(int k=0;k<=i;k++){

				if(s.charAt(i)==s.charAt(k)){

					foundcount++;
				}
			}
			if(count==2 && foundcount==1){
				
				System.out.println(s.charAt(i));
			}
			count=0;
			foundcount=0;
		}
		
	}
}