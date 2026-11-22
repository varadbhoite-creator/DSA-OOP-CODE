class Teacher{

	private String teachername;
	private Courses courses;
	Teacher(String teachername,Courses courses){

		this.teachername=teachername;
		this.courses=courses;
	}
	void setteachername(String teachername){

		this.teachername=teachername;
	}
	void setcourses(Courses courses){

		this.courses=courses;
	}
	String getteachername(){

		return teachername;
	}
	Courses getcourses(){

		return courses;
	}
}
class Courses{

	private String coursename;
	
	Courses(String coursename){

		this.coursename=coursename;
	}
	void setcoursename(String coursename){

		this.coursename=coursename;
	}
	String getcoursename(){

		return coursename;
	}
}
class Demo{

	public static void main(String[]args){

		Courses c1=new Courses("java");
		Courses c2=new Courses("python");
	
		Teacher t=new Teacher("varad",c1);
		System.out.println(t.getteachername());
		System.out.println(t.getcourses().getcoursename());	

		t.setcourses(c2);
		System.out.println(t.getteachername());
		System.out.println(t.getcourses().getcoursename());
	}
}