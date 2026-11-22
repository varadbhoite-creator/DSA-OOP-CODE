class Student{

	int a;
	
	Student(int b,this){

		this.a=b;
	}

	void fun(this){

		System.out.println(this.a,this);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		Student s1=new Student(20);

		s.fun();
		s1.fun();
	}
}

java:5: error: illegal start of type
        Student(int b,this){
                      ^
ManuallyWritten_This(eroor).java:10: error: illegal start of type
        void fun(this){