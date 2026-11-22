class Student{

	void fun(){

		System.out.println("fun");
	}

	void gun(){

		int a=10;
		System.out.println(a);
	}

	void sun(){

		System.out.println("sun");
		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s1=new Student();
		s1.fun();
		s1.gun();
		s1.sun();
	}
}


error: cannot find symbol
                System.out.println(a);
                                   ^