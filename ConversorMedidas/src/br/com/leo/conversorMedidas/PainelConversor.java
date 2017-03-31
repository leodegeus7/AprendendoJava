package br.com.leo.conversorMedidas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

import br.com.leo.conversorMedidas.conversor.Conversor;

public class PainelConversor extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PainelConversor() {
		
		JLabel lblConversoDolar = new JLabel("Valor em dolares");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblConversoReal = new JLabel("Valores em Reais");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dolar para Real");
		
		JLabel lblRealParaDolar = new JLabel("Real para Dolar");
		
		JSeparator separator = new JSeparator();
		
		JLabel lblConverorUnidades = new JLabel("Conversor Unidades");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					JLabel label = (JLabel) panel.getComponent(0);
					Conversor conversor = new Conversor();
					Double doubleValue = Double.parseDouble(textField.getText());
					Double convertido;
					try {
						convertido = conversor.converter(doubleValue, "d-r");
						label.setText(Conversor.valorFormatado(convertido));
					} catch (IllegalArgumentException e1) {
						JOptionPane.showMessageDialog(null, "Erro de conversão: " + e1.getMessage());
						e1.getMessage();
					}
					
				} 
				if (!textField_1.getText().equals("")) {
					JLabel label = (JLabel) panel_1.getComponent(0);
					Conversor conversor = new Conversor();
					Double doubleValue = Double.parseDouble(textField_1.getText());
					Double convertido;
					try {
						convertido = conversor.converter(doubleValue, "r-d");
						label.setText(Conversor.valorFormatado(convertido));
					} catch (IllegalArgumentException e1) {
						JOptionPane.showMessageDialog(null, "Erro de conversão: " + e1.getMessage());
						e1.getMessage();
					}
				} if (textField.getText().equals("") && textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Insira um valor para editar");
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				JLabel label1 = (JLabel) panel.getComponent(0);
				label1.setText("R$");
				JLabel label2 = (JLabel) panel_1.getComponent(0);
				label2.setText("U$");
			}
		});
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime.getRuntime().exit(0);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(164)
							.addComponent(lblConverorUnidades, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblConversoDolar, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblConversoReal, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
									.addGap(64)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblRealParaDolar)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(btnNewButton)
									.addGap(18)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
							.addGap(48)))
					.addGap(6))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(lblConverorUnidades)
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblConversoDolar))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblConversoReal))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblRealParaDolar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(9))
		);
		
		JLabel lblNewLabel_2 = new JLabel("U$");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("R$");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		panel.add(lblNewLabel_1);
		setLayout(groupLayout);

	}
}
