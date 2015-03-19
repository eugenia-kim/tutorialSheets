package sheet2.Question1;

public class Rectangle {
	private final Point topLeft;
	private final int width;
	private final int height;
	
	public Rectangle(Point topLeft, int width, int height) {
		this.topLeft = topLeft;
		this.width = width;
		this.height = height;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int area() {
		return width * height;
	}
	
	private Point getBottomRight() {
		return new Point(
				topLeft.getX() + width,
				topLeft.getY() + height
			);
	}
	
	public boolean contains(Rectangle r2) {
		return 
			topLeft.getX() <= r2.getTopLeft().getX() &&
			topLeft.getY() <= r2.getTopLeft().getY() &&
			getBottomRight().getX() >= r2.getBottomRight().getX() &&
			getBottomRight().getY() >= r2.getBottomRight().getY();
	}
	
	public String rectangleToString() {
		return "(top-left = " + topLeft + 
	          ", width = " + width +
	          ", height = " + height + ")";
	}

}
