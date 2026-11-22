class Demo{

	public static void main(String[]args){

		try{

			System.out.println(10/0);
			System.out.println(11);  // execute nhi jhallA VAR EXCEPTION SAPADLA TYAMULE
		}catch(ArithmeticException e){

			System.out.println("infinity");
		}
	}
}

op: infinity 

res:exception sapadla try mdhe ki direct tithun khali yeta tyacha lkhalvchas ececute hoth nahi