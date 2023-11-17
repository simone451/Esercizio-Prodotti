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
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] prodotti = {"pane", "pasta barilla","biscotti", "pasta divella", "mortadella"};
		float[] prezzi = {4.0f, 1.60f, 3.75f, 12.50f, 11f};
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
				}
			}
			if (posizione != -1) {
				System.out.println("inserisci quantita");
				quantita = Float.parseFloat(sc.nextLine());
				prezzo = quantita*prezzi[posizione];
				System.out.println("il prezzo e: " + prezzo);
			} else {
				System.out.println("prodotto non disponibile");
			}
			System.out.println("vuoi continuare? (sì/no)");
			risposta = sc.nextLine();
		} while(risposta.equals("sì"));
	}
}


