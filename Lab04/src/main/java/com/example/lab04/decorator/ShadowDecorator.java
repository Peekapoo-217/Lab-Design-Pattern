package main.java.com.example.lab04.decorator;

import main.java.com.example.lab04.graphic.Graphic;

public class ShadowDecorator extends GraphicDecorator{
	public ShadowDecorator(Graphic decoratedGraphic) {
		super(decoratedGraphic);
	}
	
	@Override
	public void draw() {
		decoratedGraphic.draw();
		drawShadow();
	}
	
	private void drawShadow() {
		System.out.println(" -> with Shadow");
	}
}
