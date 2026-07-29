package Interface;

public class User {
public static void takephoto(Camera cam) {
	cam.click();

}
public static void main(String[] args) {
	Camera cam=new Samsung();
	PlayMusic mus=new Samsung();
	takephoto(cam);
	mus.playmusic();
	System.out.println(cam.a);
	Camera.m1();
	cam.m2();
}
}
