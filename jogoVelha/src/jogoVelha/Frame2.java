package jogoVelha;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Map<Integer,JLabel> labels= new HashMap<>();
	private Game gameSystem = new Game(this);
	private Boolean controle = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 3, 1, 1));
		setContentPane(contentPane);
		
		
		


		
		JLabel lblNewLabel1 = new JLabel("-");
		lblNewLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel1);
			}
		});
		lblNewLabel1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("-");
		lblNewLabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel2);
			}
		});
		lblNewLabel2.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("-");
		lblNewLabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel3);
			}
		});
		lblNewLabel3.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("-");
		lblNewLabel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel4);
			}
		});
		lblNewLabel4.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("-");
		lblNewLabel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel5);
			}
		});
		lblNewLabel5.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("-");
		lblNewLabel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel6);
			}
		});
		lblNewLabel6.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("-");
		lblNewLabel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel7);
			}
		});
		lblNewLabel7.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel7);
		
		JLabel lblNewLabel8 = new JLabel("-");
		lblNewLabel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel8);
			}
		});
		lblNewLabel8.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel8);
		
		JLabel lblNewLabel9 = new JLabel("-");
		lblNewLabel9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeStatus(lblNewLabel9);
			}
		});
		lblNewLabel9.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel9);
		
		
		labels.put(1, lblNewLabel1);
		labels.put(2, lblNewLabel2);
		labels.put(3, lblNewLabel3);
		labels.put(4, lblNewLabel4);
		labels.put(5, lblNewLabel5);
		labels.put(6, lblNewLabel6);
		labels.put(7, lblNewLabel7);
		labels.put(8, lblNewLabel8);
		labels.put(9, lblNewLabel9);
		

		gameSystem.setMapaDoGame(labels);
		gameSystem.printGame();
	}

	void changeStatus(JLabel label) {
		if (label.getText().equals("-")) {
			if (controle == true) {
				label.setText("X");
				Color fg = new Color(0, 0, 192);
				label.setForeground(fg);
			}
			else {
				label.setText("O");
				Color fg = new Color(173, 19, 21);
				label.setForeground(fg);
			}
			controle = !controle;
		}
		gameSystem.setMapaDoGame(labels);
		gameSystem.printGame();
		
	}
	

}
