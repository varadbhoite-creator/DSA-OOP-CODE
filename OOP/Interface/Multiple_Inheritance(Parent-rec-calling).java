interface Parent1{

	int a=10;
}
interface Parent2{

	int a=20;
}
class Child implements Parent1,Parent2{

	void fun(){

		System.out.println(Parent1.a);
		System.out.println(Parent2.a);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

op:10
   20
Child Multiple Interfaces la Implement karu shakto tyane multiple inheroitance hota pn variable static asla mule ta access kartana parent vha name ni karaicha mnje child chnfuse hoth nahi