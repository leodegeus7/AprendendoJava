package desenho;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;

public class Linha implements Forma{

	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color cor;
	
	public void setCor(Color cor) {
		this.cor = cor;
	}

	public Linha(int x1,int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		cor = Color.BLUE;
		
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(cor);
		
		Graphics2D g2d = (Graphics2D) g.create();
		//Stroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 3, 1 }, 0);
		Stroke stroke2 = new BasicStroke(20);
		g2d.setStroke(stroke2);
		g2d.drawLine(x1, y1, x2, y2);
		g2d.dispose();
		
		//g.drawLine(x1, y1, x2, y2);
		//g.fillPolygon(new Polygon(xPoly, yPoly, xPoly.length));

		
	}

}
