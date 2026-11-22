abstract class Parent{

	
}
class Child extends Parent{


}
class Demo{

	public static void main(String[]args){

		Parent p=new Parent();
	}
}

 error: Parent is abstract; cannot be instantiated
                Parent p=new Parent();

	//cannot make object of abstract cllass
	//abstract class object is not created