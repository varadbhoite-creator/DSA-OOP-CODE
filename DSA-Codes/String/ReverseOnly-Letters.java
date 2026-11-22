import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=sc.nextLine();
		char []arr=s1.toCharArray();
		int len=arr.length;
		int i=0;
		int j=len-1;
		
		while(i<j){

			if(arr[i]<65 || arr[i]>90 && arr[i]<97 || arr[i]>122){
				i++;	
			}
			 if(arr[j]<65 || arr[j]>122 && arr[j]<97 || arr[j]>122){
				j--;
			}
			
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		
			i++;
			j--;
		}
		String s2=new String(arr);
		System.out.println(s2);
	}
}