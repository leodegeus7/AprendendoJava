package desenho;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JComponent;

public class Canvas extends JComponent {

	/**
	 * 
	 */

	private List<Forma> formas = new ArrayList<>();
	private List<Forma> formas2 = new ArrayList<>();

	public void adicionar(Forma f) {
		formas.add(f);
	}
	

	public int getFormasSize() {
		return formas.size();
	}

	public void remover() {
		Random rand = new Random();
		int i = rand.nextInt(formas.size());
		formas.remove(i);

	}
	
	public void adicionar2(Forma f) {
		formas2.add(f);
	}
	

	public int getFormas2Size() {
		return formas2.size();
	}

	public void removeObject(Object obj) {
		formas.remove(obj);
	}

	public void removerSelecionada(int x, int y) {
		for (int i = 0; i < formas.size(); i++) {
			Ponto2D ponto = (Ponto2D) formas.get(i);
			if (x < ponto.getX() + 20 && x > ponto.getX() - 20 && y < ponto.getY() + 20 && y > ponto.getY() - 20) {
				formas.remove(i);
			}
		}
	}

	public void moverSelecionados(int x, int y) {
		for (Forma forma : formas) {
			Ponto2D ponto = (Ponto2D) forma;
			if (ponto.getY() < y) {
				if (x < ponto.getX() + 40 && x > ponto.getX() - 40 && y < ponto.getY() + 40 && y > ponto.getY() - 40) {
					ponto.setX(ponto.getX() - 15);
					ponto.setY(ponto.getY() - 15);
				}
			} else {
				if (x < ponto.getX() + 40 && x > ponto.getX() - 40 && y < ponto.getY() + 40 && y > ponto.getY() - 40) {
					ponto.setX(ponto.getX() + 15);
					ponto.setY(ponto.getY() + 15);
				}
			}
			// if (x < ponto.getX()+20 && x > ponto.getX()-20 && y <
			// ponto.getY()+20 && y > ponto.getY()-20) {
			// ponto.setX(ponto.getX()+5);
			// ponto.setY(ponto.getY()+5);
			// }
		}
	}

	private static final long serialVersionUID = 1L;
	private int x;
	private int y;

	public Canvas(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Retangulo ret = new Retangulo(0, 0, x, y);
		ret.draw(g);
		
		for (Forma forma : formas2) {
			forma.draw(g);
		}

		for (Forma forma : formas) {
			forma.draw(g);
		}

	}

	public Dimension getPreferredSize() {
		return new Dimension(x, y);
	}

	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
}
