class Calculator{

	static void add(int a,int b){

		System.out.println(a+b);
	}

	static void multiply(int a,int b){

		System.out.println(a*b);
	}
	
	void substract(int a,int b){

		System.out.println(a-b);
	}
}
class Demo{

	public static void main(String[]args){

		Calculator.add(1,2);
		Calculator.multiply(2,2);

		Calculator c=new Calculator();
		c.substract(2,2);
	}
}