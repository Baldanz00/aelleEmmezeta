//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*Descrizione

L'ufficio immatricolazioni fornisce alla segreteria studenti l'elenco degli studenti iscritti ad un dato corso come sequenza di cognomi separati ciascuno dal successivo da un asterisco, ad esempio:

ROSSI*FERRARI*COLOMBO*BIANCHI*VILLA*BRAMBILLA*RUSSO*CATTANEO*SALA*GALLI
La segreteria deve calcolare da tale elenco il numero di studenti il cui cognome inizia con una lettera compresa tra A ed L, o tra M e Z (estremi inclusi).

Scrivete un programma che, dato nel flusso di ingresso l'elenco di studenti, emetta nel flusso di uscita una riga contenente due numeri interi separati da uno spazio corrispondenti rispettivamente alle numerosità dei due gruppi descritti sopra; nel caso dell'esempio, dovrebbe emettere

6 4*/
    System.out.println("Inserisci una stringa di cognomi separati da '*'");
    //1. mi prendo in iput la stringa contenente l'elenco
    Scanner scan = new Scanner(System.in);
    String elencoStudenti = scan.nextLine();
    //Devo dividere questa stringa , uso il metodo .split("\\*") --> serve a spezzare la stringa ad ogni *
    String[] cognomi = elencoStudenti.split("\\*");

    //3. ho bisogno di due contatori separati:
    int contaAL = 0;
    int contaMZ = 0;
    for(String cognome : cognomi){
        char letteraIniziale = cognome.charAt(0);

        if(letteraIniziale >= 'A' && letteraIniziale <= 'L'){
            contaAL++;
        } else {
            contaMZ++;
        }
    }
    System.out.println("I cognomi la cui iniziale è compresa tra A ed L sono : "+contaAL + "\nI cognomi le cui iniziali sono comprese tra M e Z sono:  " + contaMZ);
}
