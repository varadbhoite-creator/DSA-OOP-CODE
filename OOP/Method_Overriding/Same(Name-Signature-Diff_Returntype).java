class Parent{

	int fun(){

		System.out.println("in parent");
		return 10;
	}
}
class Child extends Parent{

	void fun(){

		System.out.println("in child");
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
  return type void is not compatible with int


for method overriding first checks name then sugnature and then returntype so all thre should be same so the method uverroides