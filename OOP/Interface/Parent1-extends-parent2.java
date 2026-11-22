interface Parent1{

	void fun();
}
interface Parent2 extends Parent1{

	void gun();

	public void fun(){

		System.out.println("in parent2 fun");    	// error: interface abstract methods cannot have body
								 public void fun(){
	}
}
class Child implements Parent2{

	public void gun(){

		System.out.println("in child gun");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
		c.gun();
	}
}