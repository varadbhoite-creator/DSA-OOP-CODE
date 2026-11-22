import java.io.*;
class Demo{

	public static void main(String[]args){

		try{

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			System.out.println(s);
		}catch(IOException e){

			System.out.println("catched");
		}	
	}
}