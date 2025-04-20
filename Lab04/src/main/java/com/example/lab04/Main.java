package main.java.com.example.lab04;

import main.java.com.example.lab04.decorator.BorderDecorator;
import main.java.com.example.lab04.decorator.ShadowDecorator;
import main.java.com.example.lab04.graphic.Circle;
import main.java.com.example.lab04.graphic.CompositeGraphic;
import main.java.com.example.lab04.graphic.Graphic;
import main.java.com.example.lab04.graphic.Square;

public class Main {
	public static void main(String[] args) {
		Graphic circle = new Circle();
		Graphic square = new Square();

		CompositeGraphic group = new CompositeGraphic();
		group.add(circle);
		group.add(square);
		
		Graphic decoratedGroup = new BorderDecorator(new ShadowDecorator(group));
		
		decoratedGroup.draw();
	}
}
