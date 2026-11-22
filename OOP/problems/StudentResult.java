class Student{

	private String name;
	private int rollno;
	private int maths;
	private int science;
	private int english;

	private int total;
	private int percentage; 

	Student(String name,int rollno,int maths,int science,int english){

		this.name=name;
		this.rollno=rollno;
		this.maths=maths;
		this.science=science;
		this.english=english;
	}
	void total(){

		total=maths+science+english;
	
	}
	void percentage(){

		percentage=(total*100)/300;
	}
	void result(){

		System.out.println(name);
		System.out.println(rollno);
		System.out.println(total);
		System.out.println(percentage);
		if(percentage>35){

			System.out.println("pass");
		}else{

			System.out.println("fail");
		}
	}
	void name(String name){

		this.name=name;
	}
	void rollno(int rollno){

		this.rollno=rollno;
	}
	void maths(int maths){

		this.maths=maths;
	}
	void science(int science){

		this.science=science;
	}
	void english(int english){

		this.english=english;
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student("varad",1,80,75,85);
		s.total();
		s.percentage();
		s.result();	

		s.english(100);
		s.total();
		s.percentage();
		s.result();
	}
}