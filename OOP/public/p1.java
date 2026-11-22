class Parent{

	public void fun(){

		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	
	void fun(){

		System.out.println("in child fun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

error: fun() in Child cannot override fun() in Parent
        void fun(){
             ^
  attempting to assign weaker access privileges; was public


scope kami krtoy parent cha method cha child publi mnje anywhere ani kahich nhi mnje default default mnje class file folder