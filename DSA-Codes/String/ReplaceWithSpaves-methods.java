import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		StringBuffer sb = new StringBuffer();

		for(int i=0;i<len;i++){

			String s1=arr[i];
			if(i<len-1){

				sb.append(s1+"-");
			}else{

				sb.append(s1);
			}
		}
		System.out.println(sb.toString());
	}
}