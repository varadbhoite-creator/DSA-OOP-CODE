class Student{

	void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.fun();
	}
}

 error: method fun in class Student cannot be applied to given types;
                s.fun();
                 ^
  required: int
  found:    no arguments