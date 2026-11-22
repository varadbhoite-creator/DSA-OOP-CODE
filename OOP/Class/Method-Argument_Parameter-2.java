class Student{

	int a=10;

	void fun(int b){

		a=b;
		System.out.println(a);
		System.out.println(b);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.fun(20);
	}
}