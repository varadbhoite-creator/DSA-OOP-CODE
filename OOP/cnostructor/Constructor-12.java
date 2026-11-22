class Student{

	int a;
	int b=20;

	Student(){

		a=10;
	}
	System.out.println(a);
	System.out.println(b);
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
	}
}

inastance variable cannot be accessed autside the constructor/methods.

java:10: error: <identifier> expected
        System.out.println(a);
                          ^
Constructor-12.java:10: error: <identifier> expected
        System.out.println(a);
                            ^
Constructor-12.java:11: error: <identifier> expected
        System.out.println(b);
                          ^
Constructor-12.java:11: error: <identifier> expected
        System.out.println(b);
