//DAMIANO UCCIARDO 5^AI 

package produttore_consumatore;

public class consumatore extends Thread implements Runnable{
	 
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
		
		while(true) {
			
			dalegge = bc.rimozione();
			
			//controllo se il numero ricevuto sia pari o dispari, in ogni caso incrmento i loro contatori
			if (dalegge % numeroprova == 0) {
				contapari++;
				System.out.print(" Numeri pari : " + contapari + " \n ");
			} 
			else {
				contadispari++;
				System.out.print(" Numeri dispari : " + contadispari + " \n ");
			} 
		}
	}
}