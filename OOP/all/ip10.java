interface Logger{

	private static void logmessage(){

		System.out.println("logging message");
	}

	public static void log(){

		logmessage();
	}
}
class Demo{

	public static void main(String[]args){

		Logger.log();
	}
}