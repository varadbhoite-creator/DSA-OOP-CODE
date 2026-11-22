import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		String s1="";
		int count=0;
		int iscount=0;
	
		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
	
			for(int j=i;j<len;j++){
		
				if(ch==s.charAt(j)){

					count++;
					iscount++;
				}else{
					break;
				}
			}
			s1=s1+ch+iscount;
			i=count-1;
			iscount=0;
		}
		System.out.println(s1);
	}
}