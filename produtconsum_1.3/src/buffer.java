//DAMIANO UCCIARDO 5^AI

public class buffer {
	
    private int[] coda;
    private int capacita;
    private int dimensione;
    private int testa;
    private int fine;
	
	public buffer() {
		this.capacita = 10 ;
		coda = new int[10];
		dimensione = 0;
    	testa = 0;
    	fine = -1;
	}
	
	//metodo di aggiunta numeri al buffer 
	public synchronized void aggiungi(int numero) {
		
		while (dimensione == capacita) {
			try {
				wait(); //metto in attesa i thread perchè il buffer è pieno 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
        fine = (fine + 1) % capacita; //aggiunta del numero 
        coda[fine] = numero;
        dimensione++;
        notifyAll(); //sveglia i thread in attesa 
        System.out.print(" Aggiunto al buffer il numero : " + numero + " \n ");
		
	}
	
	//metodo di rimozione numeri al buffer 
	public synchronized int rimozione() {
		
		while (dimensione == 0) {
			try {
				wait(); //metto in attesa i thread perchè il buffer è pieno
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
		
		int v = coda[testa];
        fine = (fine + 1) % capacita; //aggiunta del numero 
        dimensione--;
        notifyAll(); //sveglia i thread in attesa 
		return v;
	}
}