class Demo{
	
	static void fun(){

		System.out.println(10/0);
	}
	
	public static void main(String[]args){

		fun();
	}
}

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.fun(Throw-Why(static-trace).java:5)
        at Demo.main(Throw-Why(static-trace).java:10)

fun la exception bhetla ta phud main la gela main mdhun call kelta fun la mhaun 

throw strace thevta exception kutunz alay