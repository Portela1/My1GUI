import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
	
	private int xPosition;
	private int yPosition;
	
	public Car(int xPosition, int yPosition) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public int getxPosition() {
		return xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;

		Rectangle body = new Rectangle(xPosition, yPosition + 20, 140, 30);

		Ellipse2D.Double rearTire = new Ellipse2D.Double(xPosition + 10, yPosition + 50, 20, 20);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xPosition + 110, yPosition + 50, 20, 20);

		Line2D.Double rearWindow = new Line2D.Double(xPosition + 20, yPosition + 20, xPosition + 30, yPosition);
		Line2D.Double frontWindow = new Line2D.Double(xPosition + 105, yPosition, xPosition + 115 , yPosition + 20);
		Line2D.Double roof = new Line2D.Double(xPosition + 30, yPosition, xPosition + 105, yPosition);

		g2.setColor(Color.BLUE);
		g2.fill(body);
		g2.setColor(Color.BLACK);
		g2.fill(rearTire);
		g2.fill(frontTire);
		g2.setColor(Color.BLUE);
		g2.draw(rearWindow);
		g2.draw(frontWindow);
		g2.draw(roof);
	}

}
