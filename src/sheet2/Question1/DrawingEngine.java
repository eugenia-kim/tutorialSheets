package sheet2.Question1;

import java.util.HashSet;
import java.util.Set;

public class DrawingEngine {

	private Set<Rectangle> rectangles;
	
	public DrawingEngine() {
		rectangles = new HashSet<Rectangle>();
	}
	
	public void addRectangle(Rectangle r) {
		rectangles.add(r);
	}

	public int maxArea() {
		int result = 0;
		for(Rectangle r : rectangles) {
			if(r.area() > result) {
				result = r.area();
			}
		}
		return result;
	}
	
	public String toString() {

		String result = "Drawing engine is looking after these rectangles:";
		for(Rectangle r : rectangles) {
			result += "\n   " + r.rectangleToString();
		}
		return result;
		
	}
	
}