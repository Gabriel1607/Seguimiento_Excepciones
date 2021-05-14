package View;
import Controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{

	Controller controller;
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
		controller= new Controller(this);
	}
	
	@Override
	public void draw() {
		image(backg, 0, 0);
		controller.drawFigures();
	}
	public void mousePressed() {
		controller.mousePressed();
		
	}
}

