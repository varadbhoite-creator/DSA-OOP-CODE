class Demo{

	public static void main(String[]args){

		System.out.println(10/0);
		throw new ArithmeticException();

	}
}

//throw KeyWord- jheva exception class cha jvm object banavta samja arithmetic exception ahe tr tyacha tr tyacha phude throw lavtat throw mnje ta exceptuion thorw karta nje ta exception dakhavta

//System.out.println(10/2);
				//he doni line same ahet exception samech deta ja internall object banavta jvm ani throw kartaa ta asa pbject banavta
//throw new ArithmeticException();

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.main(ArithmeticException-Class(object).java:5)