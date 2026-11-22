interface Iterator{

	void next();
	void hasNext();
}
class ArrayList{

	private class Itr implements Iterator{

		public void next(){

			
		}

		public void hasNext(){


		}
	
	}
		static Iterator iterator(){

			return new Itr();
		}
}
class Demo{

	public static void main(String[]args){

		ArayList al=new ArrayList();

		al.add(10);
		al.add(20);

		Iterator itr=al.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}
		
	}
}