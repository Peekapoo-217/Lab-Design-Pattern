package main.java.com.example.lab04.decorator;

import main.java.com.example.lab04.graphic.Graphic;

public class BorderDecorator extends GraphicDecorator{
	public BorderDecorator(Graphic decoratedGraphic) {
		super(decoratedGraphic);
	}
	
	@Override
	public void draw() {
		decoratedGraphic.draw();
		drawBorder();
	}
	
	private void drawBorder() {
		System.out.println(" -> with Borders");
	}
}
