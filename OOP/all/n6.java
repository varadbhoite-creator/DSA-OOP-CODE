class Calculator{

	void add(int num1,int num2){

		System.out.println(num1+num2);
	}

	void add(int n1,int n2,int n3){

		System.out.println(n1+n2+n3);
	}

	void add(double n1,double n2){

		System.out.println(n1+n2);
	}

	void add(int n1,double n2){

		System.out.println(n1+n2);
	}
}
class Demo{

	public static void main(String[]args){

		Calculator c=new Calculator();

		c.add(1,1);
		c.add(2,2);
		c.add(1.0,1.0);
		c.add(1,1.0);
	}
}
