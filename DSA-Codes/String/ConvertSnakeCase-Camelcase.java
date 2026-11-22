import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split("_");
		int len=arr.length;
		String snake="";

		for(int i=0;i<len;i++){

			String s1=new String(arr[i]);
			int s1len=s1.length();

			for(int j=0;j<s1len;j++){

				if(i>0){

					if(j==0){

						char ch=(char)(s1.charAt(j)-32);
						snake=snake+ch;
					}else{

						snake=snake+s1.charAt(j);
					}
				}else{

					snake=snake + s1;
					break;
				}
			}
		}
		System.out.println(snake);
	}
}