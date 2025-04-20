package main.java.com.example.lab04.graphic;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
	private List<Graphic> children = new ArrayList<>();
	
	public void add(Graphic p) {
		children.add(p);
	}
	
	public void remove(Graphic p) {
		children.remove(p);
	}
	
	public void draw() {
		for(Graphic graphic : children) {
			graphic.draw();
		}
	}
}
