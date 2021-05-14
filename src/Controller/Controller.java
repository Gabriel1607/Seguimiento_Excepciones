package Controller;

import Model.Logic;
import processing.core.PApplet;

public class Controller {
	private PApplet app;
	private Logic logic;
	public Controller(PApplet app) {

		this.app = app;
		logic = new Logic(app);
	}
	public void drawFigures() {
		logic.drawFigure();

	}

	public void mousePressed() {
		logic.mousePressed();
	}
	
}
