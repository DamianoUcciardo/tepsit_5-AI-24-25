//DAMIANO UCCIARDO 5^AI

package produttore_consumatore;

import java.util.Random;

public class produttore extends Thread implements Runnable {
	
	Random r = new Random();
	
	private int xms;
	private int num; //numeri casuali
	private buffer bp; //istanza del buffer
	
	public produttore(buffer b) {
		this.bp = b;
	}
	
	@Override 
	public void run() {
				
		while(true) {
			
			num = r.nextInt(1024);       //inizializzo i numeri con i valori casuali
			xms = 100 + r.nextInt(1000);
			
			try {
				
				
				String nome = Thread.currentThread().getName();
				long tid = Thread.currentThread().getId();
				
				String thread = nome + "(" + tid + ")";
				System.out.println(thread + " Genero il numero : " + num + " \n ");
				
				bp.aggiungi(num);
				System.out.println(thread + " Aggiungo il numero : " + num + " al buffer " + " \n ");

				Thread.sleep(xms);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}
