import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s:");
		String s=sc.next();
		int len=s.length();
		String s3="foo bar";
		String []arr=s3.split(" ");;
		int arrlen=arr.length;
		
		for(int a=0;a<arrlen;a++){
		
			String s1=String.join("",arr);

			for(int i=0;i<len;i++){

				for(int j=i;j<len;j++){
		
					StringBuffer sb=new StringBuffer();

					for(int k=i;k<=j;k++){

						sb.append(s.charAt(k));
					}
					String s2=sb.toString();
					if(s1.equals(s2)){

						System.out.println(i);
					}
				}
			}
			
			for(int b=0;b<arrlen-1;b++){

				String temp=arr[b];
				arr[b]=arr[b+1];
				arr[b+1]=temp;
			}
		}
	}
}