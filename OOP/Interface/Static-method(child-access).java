interface Parent{

	static void fun(){

		System.out.println("in fun");
	}
}
class Child implements Parent{


}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.fun();
	}
}

 error: cannot find symbol
                c.fun();

child la interface chi static method ky jri kela tri access hoth nahi

karan ti method interface chi aste chid extends krt nahi implement karta estends kela tr ti child la alia aste implement mule ta abstract method fkt yeti direct.