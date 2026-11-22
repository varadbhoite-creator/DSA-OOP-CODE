import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		String s1="";
		for(int i=0;i<len;i++){
			
			int a=arr[i];
			char ch=arr[i];
			if(ch>='0' && ch<='9'){
	
				char cha=arr[i-1];
				for(int j=0;j<a;j++){

					s1=s1+cha;
				}
			}
		}
		System.out.println(s1);
	}
}


