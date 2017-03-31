package clipt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

public class StoryBoard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryBoard frame = new StoryBoard();
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
	public StoryBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 1050, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setAlignmentX(5.0f);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setBounds(76, 7, 41, 16);
		panel.add(lblNewLabel);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 35, 199, 327);
		// panel.add(textArea);
		textArea.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(6, 35, 334, 527);
		panel.add(scroll);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Texto Criptografado");
		lblNewLabel_1.setBounds(30, 6, 133, 16);
		panel_1.add(lblNewLabel_1);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(6, 35, 199, 327);

		JScrollPane scroll2 = new JScrollPane(textArea_1);
		scroll2.setBounds(6, 35, 334, 527);

		panel_1.add(scroll2);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setLineWrap(true);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		JButton btnChooseFile = new JButton("Choose File");
		btnChooseFile.setBounds(26, 106, 136, 29);
		panel_2.add(btnChooseFile);

		JButton btnNewButton = new JButton("Criptografar");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int foo = Integer.parseInt(textField_1.getText());
				if (foo < 1 || foo > 10) {
					JOptionPane.showMessageDialog(null, "Digite um valor de seguranca entre 1 e 10");
				} else {
					Criptografia cripto = new Criptografia();
					cripto.textoFile = textArea.getText();
					textArea.setText(textArea.getText());
					int segu = Integer.parseInt(textField_1.getText());
					cripto.begin(segu);
					textArea_1.setText(cripto.getTextoCripto());
					textField.setText(cripto.getChavecripto());
				}
			}
		});
		btnNewButton.setBounds(26, 150, 136, 29);
		panel_2.add(btnNewButton);

		JButton btnDescriptografar_1 = new JButton("Descriptografar");
		btnDescriptografar_1.setBounds(26, 199, 136, 29);
		btnDescriptografar_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Criptografia cripto = new Criptografia();
				int segu = Integer.parseInt(textField_1.getText());
				textArea.setText(cripto.descriptografarTexto(textArea_1.getText(), textField.getText(), segu));
			}
		});
		panel_2.add(btnDescriptografar_1);

		textField = new JTextField();
		textField.setBounds(26, 336, 314, 137);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel lblChave = new JLabel("Chave");
		lblChave.setBounds(29, 312, 61, 16);
		panel_2.add(lblChave);

		JLabel lblNewLabel_2 = new JLabel("Seguranca (1-10)");
		lblNewLabel_2.setBounds(26, 497, 136, 16);
		panel_2.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(26, 525, 130, 26);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		btnChooseFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OpenFile op = new OpenFile();
				try {

						Criptografia cripto = new Criptografia();
						op.chooseFile();
						String texto = op.sb.toString();
						
						int foo = Integer.parseInt(textField_1.getText());
						if (foo < 1 || foo > 10) {
							JOptionPane.showMessageDialog(null, "Digite um valor de seguranca entre 1 e 10");
						} else {
						
						cripto.textoFile = texto;
						textArea.setText(texto);
						int segu = Integer.parseInt(textField_1.getText());
						cripto.begin(segu);
						textArea_1.setText(cripto.getTextoCripto());
						textField.setText(cripto.getChavecripto());}

				} catch (IOException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro");
				}

			}
		});

	}
}
