class Demo{

	public static void main(String[]args){

		String s=null;

		System.out.println(s.charAt(5));
	}
}


reference null asla ani tya ref cha object la call kela tr ha error yeto nullpointer exception

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local1>" is null
        at Demo.main(NullPointerError.java:7)