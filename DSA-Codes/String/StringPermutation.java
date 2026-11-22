import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		char []arr1=s.toCharArray();
		int len=arr.length;
		
		for(int i=0;i<len;i++){
			
			String s2=new String(arr1);	
			System.out.println(s2);
			arr1=s2.toCharArray();
			

			for(int j=0;j<len-2;j++){

				for(int k=1;k<len-1;k++){

					char temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
				String s1=new String(arr);
				System.out.println(s1);
				arr=s1.toCharArray();
			}
			for(int a=0;a<len-1;a++){

				char temp=arr1[a];
				arr1[a]=arr1[a+1];
				arr1[a+1]=temp;
			}
			arr=arr1;


		}
	}
}