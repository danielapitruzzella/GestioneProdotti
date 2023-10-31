import java.util.Scanner;

public class Utente {
    
String nome;
String cognome;    
String username;
String password;


public Utente(String u, String p){

    this.username=u;
    this.password=p;
}

public String getUsername() {
    return username;
}
public String getPassword() {
    return password;
}

public void setUsername(String username) {
    this.username = username;
}
public void setPassword(String password) {
    this.password = password;
}

public void login(String username, String password ){
     	final String PIN_TARGET = "0123";
 	//mettiamo una stringa come costante e non un int perché l'int non legge gli 0
 	Scanner pippo = new Scanner (System.in);
 	//utilizziamo il ciclo do while
 	String pin;
 	//devo inizializzare la stringa pin che inserirà l'utente, sennò rimane locale e non la trova appena esce dal do
 	int tentativi = 3;
 	//inizializziamo a 3 che è il massimo


 	do {
 		System.out.println("Inserire pin");
 		pin = pippo.nextLine();
 		tentativi--;
 		} while(!pin.equals(PIN_TARGET)&&tentativi>0);

 	if(pin.equals(PIN_TARGET)){
 		System.out.println("Sbloccato");
 		}else {
 		System.out.println("Bloccato");	
 		}
	}
}



