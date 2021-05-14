package Model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Logic {
	private PApplet app;
	int cR,cG,cB;
	int sR,sG,sB;
	String figure;
	public Logic(PApplet app) {
		this.app = app;
	}
	public void drawFigure() {
		app.ellipseMode(PConstants.CORNER);
		app.fill(sR,sG,sB);
		app.rect(330,150,200,200);
		app.fill(cR,cG,cB);
		app.circle(660,150,200);
		//System.out.println(app.mouseX+" "+app.mouseY);

	}
	public void paintFigure() {
		
	}
	public void mousePressed() {
if(PApplet.dist(app.mouseX,app.mouseY,761,243)<100) {
			figure="circle";
		}
if((330<app.mouseX&&app.mouseX<330+200)&&(150<app.mouseY&&app.mouseY<150+200)) {
	figure="square";
}
switch(figure) {
case "square":
	if((24<app.mouseX&&app.mouseX<24+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		sR=254;
		sG=0;
		sB=2;
	}
	break;
}
		
	}
}


