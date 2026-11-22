class Student{
	
	int a=10;
	int b=20;
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
	}
}

Internally Byecode:
class Student {
  int a;

  int b;

//Constructor-ByDefault//
  Student(); 
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field a:I
      10: aload_0
      11: bipush        20
      13: putfield      #13                 // Field b:I
      16: return
}