class Main{

public static void main(String[]args){

		System.out.println("In main method");
		Education e=new Education();
		Management m=new Management();
		Couples c=new Couples();
		e.teacher();
		m.staff();
		Management.watchmen();
		c.sitting();
	}
		
	
}

class Education{

	void teacher(){

		System.out.println("timepass+mapa kadna");
	}

	void student(){

		System.out.println("ignore");
	}
}
	
class Management{	
		
	void staff(){
		
		System.out.println("zopa kadna");
	}
	
	static void watchmen(){

		System.out.println("identity check");
	}
}

class Couples{

	void sitting(){

		System.out.println("not allowed");
	}
	
}