import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		System.out.println("Enter word:");
		String word=sc.next();
		int count=0;
		String []arr=s.split(" ");
		int len=arr.length;
	
		for(int i=0;i<len;i++){
			
			String sa=arr[i];
			if(sa.equals(word)){
				count++;
			}
		}
		System.out.println(count);
	}
}