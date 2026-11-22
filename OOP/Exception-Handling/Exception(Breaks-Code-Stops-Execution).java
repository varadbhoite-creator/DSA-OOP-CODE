class Demo{

	public static void main(String[]args){

		System.out.println(5);
		System.out.println(10/0);
		System.out.println(10);
	}
}

//exception ala ki titach code break hoto tithun phude execution hoth mahi joprent handle karat nahin exception toprent 

//Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at Demo.main(Exception(Breaks-Code-Stops-Execution).java:5)

5
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.main(Exception(Breaks-Code-Stops-Execution).java:6)