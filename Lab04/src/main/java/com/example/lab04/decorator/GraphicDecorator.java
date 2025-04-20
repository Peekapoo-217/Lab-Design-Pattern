package main.java.com.example.lab04.decorator;

import main.java.com.example.lab04.graphic.Graphic;

public abstract class GraphicDecorator implements Graphic{
	 protected Graphic decoratedGraphic;
	 
	 public GraphicDecorator(Graphic decoratedGraphic) {
		 this.decoratedGraphic = decoratedGraphic;
	 }
	 
	 @Override
	 public void draw() {
		 decoratedGraphic.draw();
	 }
}
