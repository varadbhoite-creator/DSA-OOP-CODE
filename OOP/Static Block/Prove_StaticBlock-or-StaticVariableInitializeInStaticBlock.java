class Codex{

	static int a=10;
}
class Demo{

	public static void main(String[]args){

	
	}
}

Static variable gets initialized in static block and also gets store in static block on methid area.
Internally ByteCode:
	
	class Codex {
  static int a;  // static variable got declared

  Codex();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  static {};
    Code:
       0: bipush        10 // static varable initilized

       2: putstatic     #7                  // Field a:I
       5: return
}