class Student{

	int a;

	Student(){

		a=10;
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
	}
}

Internally Bytecode:
class Student {
  int a;

  Student();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field a:I
      10: return
}