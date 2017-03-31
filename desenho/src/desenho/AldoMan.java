package desenho;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import java.io.FileInputStream;

import java.io.IOException;

import javax.imageio.ImageIO;


public class AldoMan implements Forma {
	private int x;
	private int y;
	
	public AldoMan(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void changeCoordinates(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw(Graphics g) {
		BufferedImage bImage;
		try {
			bImage = ImageIO.read(new FileInputStream("aldoMan.png"));
			BufferedImage after = new BufferedImage(bImage.getWidth(), bImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
			AffineTransform at = new  AffineTransform();
			at.scale(0.25, 0.25);
			AffineTransformOp scaleOP = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
			after = scaleOP.filter(bImage, after);
			g.drawImage(after, x, y, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

}
