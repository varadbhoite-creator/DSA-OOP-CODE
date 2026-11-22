import java.util.*;
class Demo{

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units:");
		int units=sc.nextInt();
		int charges=0;
		if(units<=150){
			 charges=units*7;
		}else if(units>150){
			charges=units*10;
		}
		System.out.println(charges);	
	}
}