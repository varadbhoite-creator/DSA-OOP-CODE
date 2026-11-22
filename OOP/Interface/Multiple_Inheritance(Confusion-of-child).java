interface Parent1{

	int a=10;
}
interface Parent2{

	int a=20;
}
class Child implements Parent1,Parent2{

	void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}


 error: reference to a is ambiguous
                System.out.println(a);

child hita confuse hoto ki konta parennt cha a gheicha ta child la cmjt nahi

interface la multiple inheritance support karta