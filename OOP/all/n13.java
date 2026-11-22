interface Camera{

	default void start(){

		System.out.println("camera started");
	}
}
interface Musicplayer{

	default void start(){

		System.out.println("music started");
	}
}
class SmartPhone implements Camera , Musicplayer{

	public void start(){

		Camera.super.start();
		Musicplayer.super.start();
	}
}
class Demo{

	public static void main(String[]args){

		SmartPhone s=new SmartPhone();
		s.start();
	}
}
