package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Carro;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
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

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 297, 208, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 160, 208, 2);
		contentPane.add(separator_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(466, 297, 208, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(466, 160, 208, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(217, 299, 2, 151);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(466, 297, 2, 153);
		separator_5.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_5);
		
		JSeparator separator_5_1 = new JSeparator();
		separator_5_1.setBounds(217, 11, 2, 153);
		separator_5_1.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_5_1);
		
		JSeparator separator_5_2 = new JSeparator();
		separator_5_2.setBounds(466, 11, 2, 153);
		separator_5_2.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_5_2);
		
		JLabel carro1 = new JLabel("Carro ==>");
		carro1.setBounds(20, 173, 71, 21);
		contentPane.add(carro1);
		
		JLabel carro2 = new JLabel("Carro^");
		carro2.setBounds(250, 417, 59, 21);
		contentPane.add(carro2);
		
		JLabel carro3 = new JLabel("Carro <==");
		carro3.setBounds(588, 251, 71, 21);
		contentPane.add(carro3);
		
		JLabel carro4 = new JLabel("Carro v");
		carro4.setBounds(377, 25, 59, 21);
		contentPane.add(carro4);
		
		JButton inicio = new JButton("Iniciar");
		inicio.setBounds(35, 383, 89, 23);
		contentPane.add(inicio);

		Carro c = new Carro (carro4, carro4, carro4, carro4, inicio);
		inicio.addActionListener(c);
	}
}
