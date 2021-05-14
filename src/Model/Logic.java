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
		//Rojo
		sR=254;
		sG=0;
		sB=2;
	}
	if((113<app.mouseX&&app.mouseX<113+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Naranja
		sR=255;
		sG=121;
		sB=0;
	}
	if((201<app.mouseX&&app.mouseX<201+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Amarillo
		sR=255;
		sG=255;
		sB=1;
	}
	if((289<app.mouseX&&app.mouseX<289+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Verde
		sR=10;
		sG=226;
		sB=18;
	}
	if((377<app.mouseX&&app.mouseX<377+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Azul
		sR=45;
		sG=79;
		sB=255;
	}
	if((24<app.mouseX&&app.mouseX<24+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Violeta
		sR=123;
		sG=32;
		sB=163;
	}
	if((113<app.mouseX&&app.mouseX<113+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Fucsia
		sR=213;
		sG=0;
		sB=250;
	}
	if((201<app.mouseX&&app.mouseX<201+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Negro
		sR=0;
		sG=0;
		sB=0;
	}
	if((289<app.mouseX&&app.mouseX<289+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Gris
		sR=122;
		sG=122;
		sB=122;
	}
	if((377<app.mouseX&&app.mouseX<377+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Beige
		sR=218;
		sG=212;
		sB=157;
	}
	
	break;
case "circle":
	if((24<app.mouseX&&app.mouseX<24+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Rojo
		cR=254;
		cG=0;
		cB=2;
	}
	if((113<app.mouseX&&app.mouseX<113+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Naranja
		cR=255;
		cG=121;
		cB=0;
	}
	if((201<app.mouseX&&app.mouseX<201+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Amarillo
		cR=255;
		cG=255;
		cB=1;
	}
	if((289<app.mouseX&&app.mouseX<289+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Verde
		cR=10;
		cG=226;
		cB=18;
	}
	if((377<app.mouseX&&app.mouseX<377+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
		//Azul
		cR=45;
		cG=79;
		cB=255;
	}
	if((24<app.mouseX&&app.mouseX<24+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Violeta
		cR=123;
		cG=32;
		cB=163;
	}
	if((113<app.mouseX&&app.mouseX<113+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Fucsia
		cR=213;
		cG=0;
		cB=250;
	}
	if((201<app.mouseX&&app.mouseX<201+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Negro
		cR=0;
		cG=0;
		cB=0;
	}
	if((289<app.mouseX&&app.mouseX<289+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Gris
		cR=122;
		cG=122;
		cB=122;
	}
	if((377<app.mouseX&&app.mouseX<377+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
		//Beige
		cR=218;
		cG=212;
		cB=157;
	}
	break;
}
		
	}
}


