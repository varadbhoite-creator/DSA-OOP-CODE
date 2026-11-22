import java.util.*;
class Demo{
	
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		int len=s.length();
		int count=0;
		
		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			if(ch==' '){

				count++;
			}
		}

		int index=0;

		for(int i=0;i<count+1;i++){
	
			StringBuffer sb=new StringBuffer();

			for(int j=index;j<len;j++){
		
				char ch=s.charAt(j);

				if(ch!=' '){

					sb.append(ch);
				}else{

					index=j+1;
					break;
				}
			}
			System.out.println(sb.toString());
		}
	}
}