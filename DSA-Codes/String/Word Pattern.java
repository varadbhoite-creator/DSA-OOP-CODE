import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String S1:");
		String s1=sc.next();
		System.out.println("Enter String S2:");
		String s2=sc.nextLine();
		String []arr=s.split(" ");
		int len1=s1.length();
		int len2=arr.length;
		int left=0;
		int right=0;
		int left1=0;
		int right1=0;

		while(left<right){

			Boolean yes=false;
			if(s1.charAt(left)==s1.charAt(right)){

				while(left1<right1){

					String a=new String(arr[left]);
					String b=new String(arr[right]);

					if(a.equals(b)){

						yes=true;
					}	

					left1++;
					right1--;
				}
				if(yes==false){

					break;
				}
				left++;	
				right--;
			}
		}
		System.out.println(yes);
	}
}