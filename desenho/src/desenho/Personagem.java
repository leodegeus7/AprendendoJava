package desenho;

import java.awt.Color;
import java.awt.Graphics;

public class Personagem implements Forma {

	private int x;
	private int y;
	
	public Personagem(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.fillOval(x, y, 20, 20);
		g.setColor(Color.ORANGE);
		
	}

}
