package controller;

import java.awt.Rectangle;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadCruzamento extends Thread{

	private JLabel carro;
	private Semaphore semaforo;
	private JButton inicio;
	private int id;
	
	public ThreadCruzamento (JLabel carro, Semaphore semaforo,
			JButton inicio, int id) {
		
		this.carro = carro;
		this.semaforo = semaforo;
		this.inicio = inicio;
		this.id = id;
	}
	
	public void run () {
		
		andar();
		try {
			semaforo.acquire();
			andar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();	
		}
		andar();
	}

	private void andar() {
		
		inicio.setEnabled(false);
		Rectangle posicao;
		posicao = carro.getBounds();
		carro.getBounds(posicao);
		int x = 100;
		int y;
		switch (id) {
		case 1:
			while(x > 0) {
				
				y = x;
				x = y - 10;
				posicao.x = posicao.x + 1;
				carro.setBounds(posicao);
			}
			break;
		case 2:
			while(x > 0) {
				
				y = x;
				x = y - 10;
				posicao.y = posicao.y + 1;
				carro.setBounds(posicao);
			}
			break;
		case 3:
			while(x > 0) {
				
				y = x;
				x = y - 10;
				posicao.x = posicao.x -1;
				carro.setBounds(posicao);
			}
			break;
		case 4:
			while(x > 0) {
				
				y = x;
				x = y - 10;
				posicao.y = posicao.y - 1;
				carro.setBounds(posicao);
			}
			break;
		}
		try {
			sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
