import java.io.*;
class Demo{

	static void fun()throws IOExceptionc {

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			System.out.println(s);
		
		}
		
	public static void main(String[]args)throws IOException{

		fun();	
	}
}