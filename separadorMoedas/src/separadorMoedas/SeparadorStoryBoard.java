package separadorMoedas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SeparadorStoryBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeparadorStoryBoard window = new SeparadorStoryBoard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SeparadorStoryBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("mm");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		//lblNewLabel.setIcon(new ImageIcon("/Users/leodegeus/Documents/workspace/separadorMoedas/notas/1.jpg")).;
		//lblNewLabel.GET
		//lblNewLabel.setBounds(82, 52, 446, 314);
		//frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		ImageIcon image = new ImageIcon("notas/1.jpg");
	}
}
