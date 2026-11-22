class Add{

	void add(int a,int b){

		System.out.println(a+b);
	}

	void add(int a,int b,int c){
	
		System.out.println(a+b+c);
	}
}
class Demo{

	public static void main(String[]args){

		Add a=new Add();
		a.add(10,20);
		a.add(10,20,30);
	}
}