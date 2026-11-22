class Calculator{

	static final double PI = 3.14159;

	int multiply(int a,int b){

		return a*b;
	}

	int multiply(int a,int b,int c){

		return a*b*c;
	}

	double multiply(double a,double b){

		return a*b;
	}

	final double pi(){

		return PI;
	}
}
class Demo{

	public static void main(String[]args){

		Calculator c=new Calculator();

		System.out.println(c.multiply(10,20));
		System.out.println(c.multiply(10,20,30));
		System.out.println(c.multiply(10.0,20.0));

		System.out.println(c.pi());
	}
}