class Student{

	static int a;

	void setA(int a){

		Student.a=a;
	}
	int getA(){

		return a;
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.setA(10);
		System.out.println(s.getA());
	}
}