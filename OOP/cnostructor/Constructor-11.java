class Student{

	int a;

	Student(){

		a=10;
	}
	System.out.println(a);

}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
	}
}

java:9: error: <identifier> expected
        System.out.println(a);