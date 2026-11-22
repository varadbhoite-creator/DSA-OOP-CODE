class Student{

	int a;
	int b;

	Student(int x,int y){

		a=x;
		b=y;
	}

	Student(int x){

		a=x;
	}

	void fun(){

		System.out.println(a);
		System.out.println(b);	
	}

	void gun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10,20);
		Student s1=new Student(30);
		
		s.fun();
		s.gun();
		s1.fun();
		s1.gun();
	}
}