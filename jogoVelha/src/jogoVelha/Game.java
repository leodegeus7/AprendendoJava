package jogoVelha;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game {

	private Map<Integer, String> mapaDoGame = new HashMap<>();
	private JFrame gameFrame;
	
	public Game(JFrame frame) {
		gameFrame = frame;
		// TODO Auto-generated constructor stub
	}

	public void setMapaDoGame(Map<Integer, JLabel> mapaLabel) {
		Color fg = new Color(0, 0, 0);
		for (int i = 1; i < 10; i++) {
			mapaDoGame.put(i, mapaLabel.get(i).getText());
		}
		if (verificaGame()) {
			for (int i=1;i<10;i++) {
				mapaLabel.get(i).setText("-");
				
				mapaLabel.get(i).setForeground(fg);
			}
		}
	}

	public Map<Integer, String> getMapaDoGame() {
		return mapaDoGame;
	}

	public void printGame() {
		System.out.println(mapaDoGame);
	}

	private boolean verificaGame() {
		if (verificaCaracter("O")) {
			System.out.println("O GANHOOOOOOOU");
			return true;
		} else if (verificaCaracter("X")) {
			System.out.println("X GANHOOOOOOOU");
			return true;
		}
		return false;
	}

	private boolean verificaCaracter(String car) {
		// HORIZONTAL
		int[] num = { 1, 4, 7 };
		for (int j : num) {
			int ver = 0;
			for (int i = j; i <= j + 2; i++) {
				if (mapaDoGame.get(i).equals(car)) {
					ver++;
				}
			}
			if (ver == 3) {
				System.out.println(car + " Ganhou na horizontal");
				JOptionPane.showMessageDialog(null, car + " Ganhou na horizontal");
				reiniciaJogo();
				return true;
			}
		}

		// VERTICAL
		int[] num2 = { 1, 2, 3 };
		for (int j : num2) {
			int ver = 0;
			int numControle = 0;
			int i = j;

			while (numControle < 3) {
				if (mapaDoGame.get(i).equals(car)) {
					ver++;
				}
				i += 3;
				numControle++;
			}

			if (ver == 3) {
				System.out.println(car + " Ganhou na vertical");
				JOptionPane.showMessageDialog(null, car + " Ganhou na vertical");
				reiniciaJogo();
				return true;
			}
		}

		// DIAGONAL
		if (mapaDoGame.get(1).equals(car)) {
			if (mapaDoGame.get(5).equals(car)) {
				if (mapaDoGame.get(9).equals(car)) {
					System.out.println(car + " Ganhou na DIAGONAL 1");
					JOptionPane.showMessageDialog(null, car + " Ganhou na DIAGONAL 1");
					reiniciaJogo();
					return true;
				}
			}
		}
		if (mapaDoGame.get(3).equals(car)) {
			if (mapaDoGame.get(5).equals(car)) {
				if (mapaDoGame.get(7).equals(car)) {
					System.out.println(car + " Ganhou na DIAGONAL 2");
					JOptionPane.showMessageDialog(null, car + " Ganhou na DIAGONAL 2");
					reiniciaJogo();
					return true;
				}
			}
		}
		

		return false;
	}
	
	void reiniciaJogo() {
		gameFrame.getContentPane().removeAll();
		gameFrame.getContentPane().setVisible(false);
		JFrame frame = new Frame3();
		frame.setVisible(true);
	}
}
