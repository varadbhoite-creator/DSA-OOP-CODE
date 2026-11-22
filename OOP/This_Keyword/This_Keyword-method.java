class Student{

	int a;

	Student(int b){

		a=b;
	}

	void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		s.fun();
	}
}

//Internall This-KeyWord:

class Student{

	int a;

	Student(int b,//this:holds address of object from whuch constructor is){

		this.a=b;
	}

	void fun(//this:holds addres of object from which method is called){

		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10,//Address of s object);
		s.fun(//Address of s object);
	}
}