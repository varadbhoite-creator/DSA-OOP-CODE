import java.util.*;
class Demo{

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a amount:");
		int amu=sc.nextInt();
		int disc=0;
		
		if(amu<=7000){
		disc=10;
		}else if(amu>=7000 && amu<= 14000){
		disc=20;
		}
			
		System.out.println(disc);
	}
}