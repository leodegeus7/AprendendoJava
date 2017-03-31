package desenho;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Frame {

	static Graphics g1;
	static boolean teste = false;
	private static Canvas canvas;
	static boolean controle = false;
	static boolean controleClick = false;
	static int x1;
	static int y1;
	static AldoMan aldo;
	static int coordAldoX = 00;
	static int coordAldoY = 00;

	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("Fazendo X");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		canvas = new Canvas(1000, 700);
		canvas.setBackground(Color.black);
		frame.getContentPane().add(canvas);

		int x = (int) (Math.random() * 1000);
		int y = (int) (Math.random() * 700);
		int r = (int) (Math.random() * 256);
		int g1 = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		Color cor = new Color(r, g1, b);
		Ponto2D p1 = new Ponto2D(x, y, cor);
		canvas.adicionar(p1);
	
		

		

		class CustomMouseListener implements MouseListener, MouseMotionListener {
			public void mouseClicked(MouseEvent e) {
				
//				Timer timer2 = new Timer();
//
//				class RemindTask2 extends TimerTask {
//					public void run() {
//
//						
//						canvas.removeObject(aldo);
//						canvas.repaint();
//						coordAldoX+=5;
//						coordAldoY+=5;
//						aldo.changeCoordinates(coordAldoX, coordAldoY);
//						canvas.adicionar(aldo);
//						canvas.repaint();
//
//					}
//				}
//				timer2.schedule(new RemindTask2(), 0, 200);
				
				
//				Ponto2D ponto = new Ponto2D(e.getX(), e.getY() - 30, Color.blue);
//				canvas.adicionar(ponto);
//				canvas.repaint();
//				System.out.println("entrei aqui");
//				if (!controleClick) {
//					x1 = e.getX();
//					y1 = e.getY();
//					controleClick = true;
//					System.out.println("pressionado um");
//				}
//				else {
//					Linha linha = new Linha(x1, y1, e.getX(), e.getY());
//					canvas.adicionar2(linha);
//					canvas.repaint();
//					controleClick = false;
//					System.out.println("pressionado dois");
//				}

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				frame.setTitle(e.getX() + "  " + e.getY());
				// canvas.removerSelecionada(e.getX(), e.getY() - 30);
				canvas.moverSelecionados(e.getX(), e.getY());

				canvas.repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				//System.out.println(e.getX() + "  " + e.getY() + "   " + e.getPoint());

			}

		}

		frame.addMouseListener(new CustomMouseListener());
		frame.addMouseMotionListener(new CustomMouseListener());

		frame.setBackground(Color.BLACK);

		frame.pack();
		frame.setVisible(true);

		Timer timer = new Timer();
		class RemindTask extends TimerTask {
			public void run() {

				if (canvas.getFormasSize() == 200) {
					timer.cancel();
					controle = true;
				} else if (canvas.getFormasSize() == 0) {
					controle = false;
				}

				if (!controle) {
					int x = (int) (Math.random() * 1000);
					int y = (int) (Math.random() * 700);
					int r = (int) (Math.random() * 256);
					int g1 = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);
					Color cor = new Color(r, g1, b);
					Ponto2D p1 = new Ponto2D(x, y, cor);
					canvas.adicionar(p1);
					canvas.repaint();
				} else {
					canvas.remover();
					canvas.repaint();
				}
				System.out.println(canvas.getFormasSize());

			}
		}

		timer.schedule(new RemindTask(), 1000, 10);
		
		
		Timer timer2 = new Timer();

		class RemindTask2 extends TimerTask {
			public void run() {

				int x = (int) (Math.random() * 1000);
				int y = (int) (Math.random() * 700);
				int r = (int) (Math.random() * 256);
				int g1 = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				Color cor = new Color(r, g1, b);
				Ponto2D p1 = new Ponto2D(x, y, cor);
				canvas.adicionar(p1);
				canvas.remover();
				canvas.repaint();

			}
		}
		timer2.schedule(new RemindTask2(), 4000, 12);
//		aldo = new AldoMan(coordAldoX, coordAldoY);
//		canvas.adicionar(aldo);

		

	}

}
