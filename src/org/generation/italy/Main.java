/* package org.generation.italy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] prodotti = {"pane", "pasta barilla","biscotti", "pasta divella", "mortadella"};		//array 1
		float[] prezzi = {4.0f, 1.60f, 3.75f, 12.50f, 11f};												//array 2
		String nomeProdotto;
		int posizione, i;
		float quantita, prezzo;
		String risposta;

		do {
			System.out.println("inserisci nome prodotto");
			nomeProdotto = sc.nextLine();
			posizione = -1;

			for(i=0; i<=4; i++) {
				if(nomeProdotto.equals(prodotti[i])) {
					posizione = i;
					System.out.println("inserisci quantita");
					quantita = Float.parseFloat(sc.nextLine());
					prezzo = quantita*prezzi[i];
					System.out.println("il prezzo e: " + prezzo);
				}
			}
			if (posizione == -1) {																	//se il prodotto non è nell'array, posizione rimane == -1
				System.out.println("prodotto non disponibile");
			}
			System.out.println("vuoi continuare?");
			risposta = sc.nextLine();
		} while(risposta.equals("sì"));
	}
} */

package org.generation.italy;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Float> prezzi = new HashMap<>();
		HashMap<Integer, String> prodotti = new HashMap<>();

		// Inizializza la mappa dei prezzi direttamente
		prezzi = new HashMap<Integer, Float>() { private static final long serialVersionUID = 1L;
		{
			put(1, 4.0f);
			put(2, 1.60f);
			put(3, 3.75f);
			put(4, 12.50f);
			put(5, 11.0f);
		}};

		// Inizializza la mappa dei prodotti in modo tradizionale
		prodotti.put(1, "pane");
		prodotti.put(2, "pasta barilla");
		prodotti.put(3, "biscotti");
		prodotti.put(4, "pasta divella");
		prodotti.put(5, "mortadella");

		int codiceProdotto;
		float totale = 0;
		float quantita, prezzo;
		String risposta;

		do {
		    // Acquisisci il nome del prodotto
		    System.out.println("inserisci il codice del prodotto");
		    codiceProdotto = Integer.parseInt(sc.nextLine());

		    // Acquisisci il prezzo dal mappa
		    prezzo = prezzi.get(codiceProdotto);

		    // Se il prezzo è nullo, il prodotto non è disponibile
		    if (prezzo != -1) {
		        // Acquisisci la quantità
		        System.out.println("inserisci quantita");
		        quantita = Float.parseFloat(sc.nextLine());

		        // Calcola il prezzo totale
		        prezzo = quantita * prezzo;

		        // Aggiorna il totale
		        totale += prezzo;

		        // Stampa il prezzo totale
		        System.out.println("il prezzo e: " + prezzo);
		    } else {
		        System.out.println("prodotto non disponibile");
		    }

		    // Acquisisci la risposta all'input
		    System.out.println("vuoi continuare? (sì/no)");
		    risposta = sc.nextLine().toLowerCase();
		} while (risposta.equals("sì"));

		// Stampa il totale
		System.out.println("il totale e: " + totale);
	}
}