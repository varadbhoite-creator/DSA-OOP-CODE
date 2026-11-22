class Student{

	int a;

	Student(int b){

		a=b;
		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s = new Student(10);
	}
}

//Internall Thiskeyword:

class Student{

	int a;

	Student(int b,//this=address of object){

		this.a=b;
		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s = new Student(10,//address of object);
	}
}