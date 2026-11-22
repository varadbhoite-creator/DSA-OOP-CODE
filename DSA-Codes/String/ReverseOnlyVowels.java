import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		int i=0;
		int j=len-1;
		System.out.println(j);
	
		while(i<j){
		
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u'){

				System.out.println(i);
				i++;
			}
			 if(arr[j]!='a' && arr[j]!='e' && arr[j]!='i' && arr[j]!='o' && arr[j]!='u'){
				System.out.println(j);
				j--;				
			}
			
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		String s1=new String(arr);
		System.out.println(s1);
	}
}