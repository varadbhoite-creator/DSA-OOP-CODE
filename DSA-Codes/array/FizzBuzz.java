import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();

		ArrayList<Object> al=new ArrayList<>();

		for(int i=1;i<=n;i++){

			if(i%3==0 && i%5==0){

				al.add("FizzBuzz");
			}else if(i%3==0){

				al.add("Fizz");
			}else if(i%5==0){

				al.add("Bizz");
			}else{

				al.add(i);
			}
		}
		System.out.println(al);
	}
}