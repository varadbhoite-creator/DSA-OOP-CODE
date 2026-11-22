class Student{

	private int a;

	Student(int a){
	
		this.a=a;
	}
	void seta(int a){

		this.a=a;
	}
	int geta(){

		return a;
	}
	String getA(){

		return a;
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		System.out.println(s.geta());
	
		System.out.println(s.getA());
	}
}