class Student{

	private String studentname;
	private College c;
	
	Student(String studentname,College c){

		this.studentname=studentname;
		this.c=c;
	}
	void setstudentname(String studentname){

		this.studentname=studentname;
	}
	void setcollege(College c){

		this.c=c;	
	}
	String getstudentname(){

		return studentname;
	}
	College getcollege(){

		return c;
	}
}
class College{

	private String collegename;
	
	College(String collegename){

		this.collegename=collegename;
	}
	void setcollegename(String collegename){

		this.collegename=collegename;
	}
	String getcollegename(){

		return collegename;
	}
}
class Demo{

	public static void main(String[]args){

		College c=new College("ytc");

		Student s1=new Student("varad",c);
		System.out.println(s1.getstudentname());
		System.out.println(s1.getcollege().getcollegename());

		Student s2=new Student("yash",c);
		System.out.println(s2.getstudentname());
		System.out.println(s2.getcollege().getcollegename());
	}
}