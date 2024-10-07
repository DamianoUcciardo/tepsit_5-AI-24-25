//DAMIANO UCCIARDO 5^AI 

public class consumatore extends Thread implements Runnable{
	 
	private int c2 = 200;
	private int valc = 0;
	private int dalegge;
	private int numeroprova = 2; //per fare il modulo uso questo attributo 
	private int contapari = 0;
	private int contadispari = 0;
	private buffer bc; //istanza del buffer
	
	public consumatore(buffer b) {
		this.bc = b;
	}
	
	@Override 
	public void run() {
		
		while(valc < 5000) {
			
			if (c2 == 200) {
				
				try {
					Thread.sleep(c2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				dalegge = bc.rimozione();
	
				//controllo se il numero ricevuto sia pari o dispari, in ogni caso incrmento i loro contatori
				if 	(dalegge % numeroprova == 0) {
					contapari++;
					System.out.print(" Numeri pari : " + contapari + " \n ");
				} 
					else 	{
					contadispari++;
					System.out.print(" Numeri dispari : " + contadispari + " \n ");
				}
				
				c2 = c2 + 200;
			}
			
			if (c2 == 400) {
				
				try {
					Thread.sleep(c2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				dalegge = bc.rimozione();
	
				//controllo se il numero ricevuto sia pari o dispari, in ogni caso incrmento i loro contatori
				if 	(dalegge % numeroprova == 0) {
					contapari++;
					System.out.print(" Numeri pari : " + contapari + " \n ");
				} 
					else 	{
					contadispari++;
					System.out.print(" Numeri dispari : " + contadispari + " \n ");
				}
				
				c2 = c2 + 200;
				
			}
			
			if (c2 == 600) {
				
				try {
					Thread.sleep(c2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				dalegge = bc.rimozione();
	
				//controllo se il numero ricevuto sia pari o dispari, in ogni caso incrmento i loro contatori
				if 	(dalegge % numeroprova == 0) {
					contapari++;
					System.out.print(" Numeri pari : " + contapari + " \n ");
				} 
					else 	{
					contadispari++;
					System.out.print(" Numeri dispari : " + contadispari + " \n ");
				}
				
				c2 = c2 + 200;
				
			}
			
			if (c2 == 800) {
				
				try {
					Thread.sleep(c2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				dalegge = bc.rimozione();
	
				//controllo se il numero ricevuto sia pari o dispari, in ogni caso incrmento i loro contatori
				if 	(dalegge % numeroprova == 0) {
					contapari++;
					System.out.print(" Numeri pari : " + contapari + " \n ");
				} 
					else 	{
					contadispari++;
					System.out.print(" Numeri dispari : " + contadispari + " \n ");
				}
				
				c2 = c2 + 200;
				
			}
			
			if (c2 == 1000) {
				
				try {
					Thread.sleep(c2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				dalegge = bc.rimozione();
	
				//controllo se il numero ricevuto sia pari o dispari, in ogni caso incrmento i loro contatori
				if 	(dalegge % numeroprova == 0) {
					contapari++;
					System.out.print(" Numeri pari : " + contapari + " \n ");
				} 
					else 	{
					contadispari++;
					System.out.print(" Numeri dispari : " + contadispari + " \n ");
				}
				
				c2 = c2 - 800; 
				valc++;
				
			}
		}
	}
}