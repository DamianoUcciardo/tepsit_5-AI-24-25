//DAMIANO UCCIARDO 5^AI

import java.util.Random;

public class produttore extends Thread implements Runnable {
	
	Random r = new Random();
	
	private int c = 0;
	private int valp = 0;
	private int xms;
	private int num; //numeri casuali
	private buffer bp; //istanza del buffer
	
	public produttore(buffer b) {
		this.bp = b;
	}
	
	@Override 
	public void run() {
				
		while(valp < 5000) {
			
			num = r.nextInt(1024);       //inizializzo i numeri con i valori casuali
			xms = 100 + r.nextInt(1000);
			
			try {
				
				String nome = Thread.currentThread().getName();
				long tid = Thread.currentThread().getId();
				String thread = nome + "(" + tid + ")";
				
				if(c == 0) {
				
					System.out.println(thread + " Genero il numero : " + num + " \n ");
					bp.aggiungi(num);
					System.out.println(thread + " Aggiungo il numero : " + num + " al buffer " + " \n ");

					Thread.sleep(100);
					c++;
					
				}
				
				if(c == 1) {
					
					System.out.println(thread + " Genero il numero : " + num + " \n ");
					bp.aggiungi(num);
					System.out.println(thread + " Aggiungo il numero : " + num + " al buffer " + " \n ");

					Thread.sleep(250);
					c++;
					
				}
				
				if(c == 3) {
					
					System.out.println(thread + " Genero il numero : " + num + " \n ");
					bp.aggiungi(num);
					System.out.println(thread + " Aggiungo il numero : " + num + " al buffer " + " \n ");

					Thread.sleep(500);
					c++;
					
				}
				
				if(c == 4) {
					
					System.out.println(thread + " Genero il numero : " + num + " \n ");
					bp.aggiungi(num);
					System.out.println(thread + " Aggiungo il numero : " + num + " al buffer " + " \n ");

					Thread.sleep(1000);
			
				}
				
				valp++;
				c = 0;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}