class Student{

	int a;

	Student(int b){
	
		a=b;
		System.out.println(a);
	}
}
class Demo{
	
	public static void main(String[]args){

		Student s=new Student(20);
		Student s1=new Student(30);
	}
}