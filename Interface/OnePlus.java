package Interface;

public class OnePlus  implements Camera ,PlayMusic{
	public void click() {
		System.out.println("I take photo using Oneplus phone");
	}

	@Override
	public void playmusic() {
		System.out.println("I will play music using oneplus");
		

		
	}

}
