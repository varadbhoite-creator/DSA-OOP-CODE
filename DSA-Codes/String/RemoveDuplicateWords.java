import java.util.*;
class Demo{

	static StringBuffer solution(String s){

		String []arr=s.split(" ");
		int len=arr.length;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<len;i++){
			
			String s1=arr[i];
			Boolean found =false;	
			for(int j=0;j<i;j++){

				String s2=arr[j];
			
				if(s1.equals(s2)){

					found=true;
					break;
				}
			}
			if(found==false){

				sb.append(s1+" ");
			}
		}
		return sb;
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");	
		String s=sc.nextLine();
	
		StringBuffer sb=solution(s);
		System.out.println(sb.toString());
	}
}