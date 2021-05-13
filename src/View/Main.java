package View;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	@Override
	public void settings() {
		size(1200,700);
	}
	
	PImage backg;
	
	@Override
	public void setup() {
		backg = loadImage("fondo.jpg");
	}
	
	@Override
	public void draw() {
		image(backg, 0, 0);
	}
}

