class Student{

	void fun(int a){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10); //argument send in obect goes to constructor
		s.fun(); //agrument send while call method goes to method
	}
}

 error: constructor Student in class Student cannot be applied to given types;
                Student s=new Student(10);
                          ^
  required: no arguments
  found:    int