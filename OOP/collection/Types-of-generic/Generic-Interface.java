interface Codex<T>{

	void display(T data);
}
class Child implements Codex<Integer>{

	public void display(Integer data){

		System.out.println(data);
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child();
		c.display(10);
	}
}