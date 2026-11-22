import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		int count=0;
		String vowels="aeiou";

		for(int i=0;i<len;i++){
			
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				count++;
			}
		}
	
		if(count!=len){

		for(int i=0;i<count;i++){

			for(int j=len-1-i;j>0;j--){

				char ch=arr[j];
				if(vowels.indexOf(ch)!=-1){

					char temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		String s1=new String(arr);
		System.out.println(s1);

		}else{

			System.out.println(s);
		}
	}
}