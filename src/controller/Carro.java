package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Carro implements ActionListener {

	private JLabel carro1;
	private JLabel carro2;
	private JLabel carro3;
	private JLabel carro4;
	private JButton inicio;
	public static Semaphore semaforo;
	
	public Carro (JLabel carro1, JLabel carro2, JLabel carro3, 
			JLabel carro4, JButton inicio) {
		
		this.carro1 = carro1;
		this.carro2 = carro2;
		this.carro3 = carro3;
		this.carro4 = carro4;
		this.inicio = inicio;
	}
	
	private void carroAnda() {
		
		int id = 1;
		semaforo = new Semaphore(1);
			
			Thread c1 = new ThreadCruzamento(carro1, semaforo, inicio, id);
			id++;
			Thread c2 = new ThreadCruzamento(carro2, semaforo, inicio, id);
			id++;
			Thread c3 = new ThreadCruzamento(carro3, semaforo, inicio, id);
			id++;
			Thread c4 = new ThreadCruzamento(carro4, semaforo, inicio, id);
			c1.start();
			c2.start();
			c3.start();
			c4.start();
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		carroAnda();
		
	}
	
}
