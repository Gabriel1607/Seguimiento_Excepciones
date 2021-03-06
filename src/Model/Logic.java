package Model;

import exception.ValidationColor;
import exception.ValidationFigure;
import processing.core.PApplet;
import processing.core.PConstants;

public class Logic {
	private PApplet app;
	int cR,cG,cB;
	int sR,sG,sB;
	boolean noFigSelect;
	boolean noColor;
	int compFigures;
	String figure;
	public Logic(PApplet app) {
		this.app = app;
		noFigSelect=false;
		noColor = false;
		sR=255;
		sG=255;
		sB=255;
		cR=255;
		cG=255;
		cB=255;
	}
	public void drawFigure() {
		app.ellipseMode(PConstants.CORNER);
		app.fill(sR,sG,sB);
		app.rect(330,150,200,200);
		app.fill(cR,cG,cB);
		app.circle(660,150,200);
		//System.out.println(app.mouseX+" "+app.mouseY);
if(noFigSelect) {
	app.fill(255,0,0);
	app.textSize(30);
	app.text("?Primero debes seleccionar una figura!",597,552);	
}

if(compFigures==1) {
	app.fill(0,110,0);
	app.textSize(30);
	app.text("?Las figuras coinciden!",597,552);	
}
if(compFigures==2) {
	app.fill(255,0,0);
	app.textSize(30);
	app.text("?Las figuras NO coinciden!",597,552);	
}

if(noColor) {
	app.fill(255,0,0);
	app.textSize(30);
	app.text("?Selecciona un color para cada figura!",597,552);	
}
}
	
	public void compareFigure() {
		
		if(sR==cR&&sG==cG&&sB==cB) {
			compFigures=1;
		}
		else {	
			try {
				compFigures=2;
				throw new ValidationFigure ("?Las figuras NO coinciden!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		
		
		
		
	}
	public void mousePressed() {
		if(PApplet.dist(app.mouseX,app.mouseY,761,243)<100) {
					figure="circle";
					noFigSelect=false;
				}
		if((330<app.mouseX&&app.mouseX<330+200)&&(150<app.mouseY&&app.mouseY<150+200)) {
			figure="square";
			noFigSelect=false;
		}
		try {
			switch(figure) {
			case "square":
				if((24<app.mouseX&&app.mouseX<24+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Rojo
					sR=254;
					sG=0;
					sB=2;
					noColor = false;
					compFigures = 0;
				}
				if((113<app.mouseX&&app.mouseX<113+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Naranja
					sR=255;
					sG=121;
					sB=0;
					noColor = false;
					compFigures = 0;
				}
				if((201<app.mouseX&&app.mouseX<201+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Amarillo
					sR=254;
					sG=254;
					sB=1;
					noColor = false;
					compFigures = 0;
				}
				if((289<app.mouseX&&app.mouseX<289+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Verde
					sR=10;
					sG=226;
					sB=18;
					noColor = false;
					compFigures = 0;
				}
				if((377<app.mouseX&&app.mouseX<377+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Azul
					sR=45;
					sG=79;
					sB=255;
					noColor = false;
					compFigures = 0;
				}
				if((24<app.mouseX&&app.mouseX<24+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Violeta
					sR=123;
					sG=32;
					sB=163;
					noColor = false;
					compFigures = 0;
				}
				if((113<app.mouseX&&app.mouseX<113+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Fucsia
					sR=255;
					sG=0;
					sB=243;
					noColor = false;
					compFigures = 0;
				}
				if((201<app.mouseX&&app.mouseX<201+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Negro
					sR=0;
					sG=0;
					sB=0;
					noColor = false;
					compFigures = 0;
				}
				if((289<app.mouseX&&app.mouseX<289+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Gris
					sR=122;
					sG=122;
					sB=122;
					noColor = false;
					compFigures = 0;
				}
				if((377<app.mouseX&&app.mouseX<377+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Beige
					sR=218;
					sG=212;
					sB=157;
					noColor = false;
					compFigures = 0;
				}
				
				break;
			case "circle":
				if((24<app.mouseX&&app.mouseX<24+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Rojo
					cR=254;
					cG=0;
					cB=2;
					noColor = false;
					compFigures = 0;
				}
				if((113<app.mouseX&&app.mouseX<113+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Naranja
					cR=255;
					cG=121;
					cB=0;
					noColor = false;
					compFigures = 0;
				}
				if((201<app.mouseX&&app.mouseX<201+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Amarillo
					cR=254;
					cG=254;
					cB=1;
					noColor = false;
					compFigures = 0;
				}
				if((289<app.mouseX&&app.mouseX<289+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Verde
					cR=10;
					cG=226;
					cB=18;
					noColor = false;
					compFigures = 0;
				}
				if((377<app.mouseX&&app.mouseX<377+69)&&(430<app.mouseY&&app.mouseY<430+68)) {
					//Azul
					cR=45;
					cG=79;
					cB=255;
					noColor = false;
					compFigures = 0;
				}
				if((24<app.mouseX&&app.mouseX<24+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Violeta
					cR=123;
					cG=32;
					cB=163;
					noColor = false;
					compFigures = 0;
				}
				if((113<app.mouseX&&app.mouseX<113+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Fucsia
					cR=255;
					cG=0;
					cB=243;
					noColor = false;
					compFigures = 0;
				}
				if((201<app.mouseX&&app.mouseX<201+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Negro
					cR=0;
					cG=0;
					cB=0;
					noColor = false;
					compFigures = 0;
				}
				if((289<app.mouseX&&app.mouseX<289+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Gris
					cR=122;
					cG=122;
					cB=122;
					noColor = false;
					compFigures = 0;
				}
				if((377<app.mouseX&&app.mouseX<377+69)&&(527<app.mouseY&&app.mouseY<527+68)) {
					//Beige
					cR=218;
					cG=212;
					cB=157;
					noColor = false;
					compFigures = 0;
				}
				break;
			}
			//Bot?n de comparar
			if((20.05<app.mouseX&&app.mouseX<20.05+197.84)&&(629.66<app.mouseY&&app.mouseY<629.66+47.96)) {
				try {
					if((sR==255 && sG==255 && sB==255) || (cG==255 && cR==255 && cG==255)) {
						noColor = true;
						compFigures=0;
						throw new ValidationColor("?Selecciona un color para cada figura!");
					}else{
						compareFigure();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
			//Bot?n de Limpiar
			if((252.07<app.mouseX&&app.mouseX<252.07+197.87)&&(629.66<app.mouseY&&app.mouseY<629.66+47.96)) {
				
				sR=255;
				sG=255;
				sB=255;
				cR=255;
				cG=255;
				cB=255;
				figure=null;
				compFigures=0;
				noColor=false;
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			noFigSelect=true;
			compFigures = 0;
			noColor=false;
				}
		
	}
}


