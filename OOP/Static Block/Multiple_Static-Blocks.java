class Codex{
	static{
		System.out.println("in static block 1");
	}
	
}
class Demo{

	public static void main(String[]args){
		Codex c=new Codex();
		Codex c=new Codex();
	}
}