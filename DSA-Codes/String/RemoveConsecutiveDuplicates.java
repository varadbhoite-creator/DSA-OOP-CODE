import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int count=0;
		int duplicate=0;
		String s1="";
		
		for(int i=0;i<len;i++){
			char ch=s.charAt(i);
			for(int j=i;j<len;j++){

				if(ch==s.charAt(j)){

					count++;
					duplicate++;
				}else{
					break;
				}
				if(duplicate==2){
					s1=s1+ch;
				}
			}
			i=count-1;
			duplicate=0;
		}
		System.out.println(s1);
	}
}