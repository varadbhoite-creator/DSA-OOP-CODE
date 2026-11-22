import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=null;

		try{
			sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println(10/a);
		}catch(Exception e){

			System.out.println("catched");
		}finally{
			sc.close();
			System.out.println("clean up code");
		}
	}
}