//DAMIANO UCCIARDO 5^AI 

package produttore_consumatore;

public class Main {
	//MAIN
	public static void main(String[] args) {
		
        buffer b = new buffer();
        produttore p = new produttore(b); //istanze 
        consumatore c = new consumatore(b);

        p.start(); //metto il produttore in satto pronto
        c.start(); //metto il consumatore in satto pronto
        
    }
}
