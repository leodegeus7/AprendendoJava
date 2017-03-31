package desenho;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo implements Forma {

	private int x;
	private int h;
	private int y;
	private int w;
	private Color cor;

	
	
	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public Retangulo(int x,int y, int w,int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, w, h);
		//g.drawRect(x, y, w, h);
		
		
	}

}
