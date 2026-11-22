class Student{

	int a;
	int b;

	Student(int x,int y){
	
		this.a=x;
		this.b=y;
	}

	void gun(){

		System.out.println(this.a);
		System.out.println(this.b);
	}

	void fun(int x){

		this.a=x;
		System.out.println(this.a);
	}

	void man(){
	
		this.a=200;
		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10,20);
		
		s.gun();
		s.fun(100);
		s.man();  

		System.out.println(s.a);
		System.out.println(s.b);
	}
}