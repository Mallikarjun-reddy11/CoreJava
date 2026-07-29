package Interface;

public class Samsung implements Camera , PlayMusic{
	public void click() {
		System.out.println("I take photo using Samsung phone ");
	}

	@Override
	public void playmusic() {
		System.out.println("I will play music using Samsung");
		
	}

}
