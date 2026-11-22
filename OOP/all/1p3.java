interface Camera{

	default void start(){

		System.out.println("smartphone starts");
	}
}
interface MusicPlayer{

	default void start(){

		System.out.println("smartphone starts");
	}
}
class SmartPhone implements Camera,MusicPlayer{

	public void start(){

		Camera.super.start();
		
	}
}
class Demo{

	public static void main(String[]args){

	 	SmartPhone s=new SmartPhone();
		s.start();
	}
}