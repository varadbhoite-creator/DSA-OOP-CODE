class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/0);

		}catch(ArithmeticException e){

			System.out.println("cannot give answer");
		}
	}
}

op:cannot give answer


using tr and catch we can read the error in readable manner and handle that error properly and make that larger error smaller 


try{


}catch(//class e){


}

Syntax to handle exception

try mdhe jithe error yeail ta lihaycha ani catche mdhe throw jhalala exception catch karaicha variable mdhe ani apla phaije ta op deicha exception handle karun.