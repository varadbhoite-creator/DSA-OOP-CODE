interface Printable{

	void print();
}
interface Showable{
	
	void print();
}
class Document implements Printable,Showable{

	public void print(){

		System.out.println("printing document");
	}
}
class Demo{

	public static void main(String[]args){

		Document d=new Document();
		d.print();
	}
}