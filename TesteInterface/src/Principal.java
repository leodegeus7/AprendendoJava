import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField meuTextField;
	private int xPos = 109;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel stringTeste = new JLabel("Contar numero de letras no nome");
		stringTeste.setBounds(109, 44, 254, 16);
		contentPane.add(stringTeste);
		
		JButton botao = new JButton("Testandoo");
		//Timer timer;
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Timer timer = new Timer();
					timer.schedule(new Deslocar(), 0, 1);
				
				
				
			}
		});
		
		botao.setBounds(122, 169, 117, 29);
		contentPane.add(botao);
		
		meuTextField = new JTextField();
		meuTextField.setBounds(109, 89, 130, 26);
		contentPane.add(meuTextField);
		meuTextField.setColumns(10);
	}
	
	class Deslocar extends TimerTask {

		@Override
		public void run() {
			meuTextField.setBounds(xPos, 89, 130, 26);
			if (xPos < 280) 
			{
				xPos+=5;
			}else {
				xPos = 109;
			}
		}
		
	}
}
