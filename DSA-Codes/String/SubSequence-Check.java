import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		int s1len=s1.length();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		int s2len=s2.length();
		Boolean isfound=false;
		
		for(int i=0;i<s1len;i++){

			isfound=false;
n
			for(int j=0;j<s2len;j++){

				if(s1.charAt(i)==s2.charAt(j)){

					isfound=true;
					break;
				}
			}
			if(isfound==false){

				break;
			}
		}
		System.out.println(isfound);
	}
}