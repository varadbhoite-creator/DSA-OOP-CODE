class Codex{

	private Codex(){

		
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex();
	}
}

 Codex() has private access in Codex
                Codex c=new Codex();  

id constructore is private then object of that class could not be made outside the class so we should make it inside the class