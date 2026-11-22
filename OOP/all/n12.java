interface Printable{

	void print();
}
interface Showable{

	void show();
}
interface Document extends Printable , Showable{

	
}
class Pdf implements Document{

	public void print(){

		System.out.println("print");
	}

	public void show(){

		System.out.println("show");
	}
}
class Demo{

	public static void main(String[]args){

		Document d=new Pdf();

		d.print();
		d.show();
	}
}