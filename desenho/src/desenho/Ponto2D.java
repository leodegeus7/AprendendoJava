package desenho;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ponto2D implements Forma{

	private int x;
	private int y;
	private Color cor;
	
	public Ponto2D(int x,int y,Color cor) {
		this.x = x;
		this.y = y;
		this.cor = cor;
	}
	
	@Override
	public void draw(Graphics g) {


		g.setColor(cor);;
		g.fillOval(x, y, 10, 10);
		
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
