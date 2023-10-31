import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoProdotti {
    public static void main(String[] args) {
        
	final String USERNAME = "danielapitruzzella";
    final String PASSWORD = "26122004";
 	//mettiamo una stringa come costante e non un int perché l'int non legge gli 0
 	Scanner pippo = new Scanner (System.in);
 	//utilizziamo il ciclo do while
 	String username;
    String password;
 	//devo inizializzare la stringa pin che inserirà l'utente, sennò rimane locale e non la trova appena esce dal do
 	int tentativi = 3;
 	//inizializziamo a 3 che è il massimo

    Prodotto p1 = new Prodotto("martello", "modello1", "casalandia", 30.50);
    Prodotto p2 = new Prodotto("Cacciavite", "modello2", "casalandia", 40.00);
    List <Prodotto> prodotti = new ArrayList<>();
    prodotti.add(p1);
    prodotti.add(p2);

    System.out.println("Menu: \n-login (inserire 1)\n-esci (inserire 0)");
    int scelta1 = pippo.nextInt();
    if(scelta1==1){

 	do {
 		System.out.println("Inserire username");
 		username = pippo.nextLine();
        System.out.println("INserire pw");
        password = pippo.nextLine();
 		tentativi--;
 		} while((!username.equals(USERNAME))&&(!password.equals(PASSWORD))&&(tentativi>0));

 	if(username.equals(USERNAME)&&password.equals((PASSWORD))){
 		System.out.println("Sbloccato");

        System.out.println("Menu: \n-visualizza prodotti(1)\n-esci(0)");
        System.out.println("Inserire scelta:");
        int scelta2= pippo.nextInt();
        switch (scelta2) {
            case 1:
               for (Prodotto prodotto : prodotti) {
                System.out.println(prodotto);
               }
                break;
            case 2:
            System.out.println("Uscita1");
            default:
                break;
        }



















 		}else {
 		System.out.println("Bloccato");	
 		}
	
    }else{
        System.out.println("Arrivederci e grazie");
    }
    }
    }
