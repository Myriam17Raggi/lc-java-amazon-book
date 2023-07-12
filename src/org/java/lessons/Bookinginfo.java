package org.java.lessons;

public class Bookinginfo {
    public static void main(String[] args) {

    // dichiaro quali variabili rappresentano le caratteristiche del libro
        String coverImage;
        String title;
        String author;
        long isbn;

    //tipi di libro
        boolean isFlexableCover;
        boolean isKindle;

    //campi della data pubblicazione
        int dayOfPubblishing;
        int monthOnPubblishing;
        int yearOnPubblishing;

    //campi per il rating
        int numberOfRating;
        float avgRating;

    // assegno un valore alle variabili
       // coverImage = ""; // fra apici aggiungere link dell'immagine del libro
        title ="Clean code: a handbook of Agile Software cratftmanshio";
        author = "Robert C. Martin";
        isbn = 9780132350884L;
        isFlexableCover = true;
        isKindle = true;
        dayOfPubblishing = 1;
        monthOnPubblishing = 8;
        yearOnPubblishing = 2008;
        numberOfRating = 5559;
        avgRating = 4.7F; //inserire la lettera F alla fine per definire che è un float

        System.out.println("Title: " + title); //il + concatena
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn); //isbn è un numero intero, Java lo tratterà come se fosse una stringa e non un numero
        System.out.println("Is flexable cover: " + isFlexableCover);
        System.out.println("Is kindle: " + isKindle);

    // dichiaro e inizializzo una variabile string che contiene la data
    // giorno / mese / data
        String dateOfPubblifhing = dayOfPubblishing + "/" + monthOnPubblishing + "/" + yearOnPubblishing;
        System.out.println("Date of pubblishing: " + dateOfPubblifhing);

    // dichiaro e inizializzo una variabile string con le informazioni di rating
        String ratingInfo = avgRating + "over" + numberOfRating + "ratings";
        System.out.println(ratingInfo); //la srtring potevo anche inserirla fra le oarentisi del sistem out. Il programma funziona lo stesso perché Java sa come deve lavorare

    }
}
