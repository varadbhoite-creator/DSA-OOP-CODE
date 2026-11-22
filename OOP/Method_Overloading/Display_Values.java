class Values{

	void display(int a){

		System.out.println(a);
	}
	
	void display(String a){

		System.out.println(a);
	}

	void display(double a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Values v=new Values();
		v.display(10);
		v.display("varad");
		v.display(12.89);
	}
}