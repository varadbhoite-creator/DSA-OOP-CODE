class Student{

	int a;
	int b;
	int c;

	Student(int x,int y,int z){

		a=x;
		b=y;
		c=z;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

	Student(int x,int y){

		a=x;
		b=y;

		System.out.println(a);
		System.out.println(b);
	}

	Student(){

		System.out.println(a);
		System.out.println(b);

	}
}
class Demo{

	public static void main(String[]args){

		Student s1=new Student(10,20,30);
		Student s2=new Student(100,200);
		Student s3=new Student();
	}
}