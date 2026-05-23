//Daria Korepov - TE23E
// Detta är huvudklassen där programmet startar. 
// Här finns en meny som låter användaren hämta data från servern, skriva ut data eller lägga till nya böcker och tidningar lokalt.

package com.slutprojet;

import java.util.ArrayList;
import java.util.Arrays;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.net.URL;  
import kong.unirest.*;
import java.lang.reflect.Type;

public class Main {
    // 1. Två listor där vi sparar böcker och tidningar
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Magazine> magazines = new ArrayList<>();

    // 2. Adressen till servern där vi hämtar datan
    static final String SERVER = "http://10.151.168.5:3130";

    public static void main(String[] args) {
        boolean running = true;

        // 3. Programmet körs i en loop tills användaren väljer att avsluta
        while (running) {

            // Meny
            System.out.println("\n--- Bibliotek ---");
            System.out.println("1. Hämta böcker från servern");
            System.out.println("2. Hämta tidningar från servern");
            System.out.println("3. Skriv ut alla böcker");
            System.out.println("4. Skriv ut alla tidningar");
            System.out.println("5. Lägg till bok lokalt");
            System.out.println("6. Lägg till tidning lokalt");
            System.out.println("7. Avsluta");
            String val = System.console().readLine("Välj ett alternativ: ");


            // 4. Användarens val hanteras med en switch-sats
            switch (val){
                case "1" -> {
                    String json = HttpHelper.getBooks();

                    if (json != null){
                        Gson gson = new Gson();
                        Type typ_arr_books = new TypeToken<ArrayList<Book>>(){}.getType();
                        books = gson.fromJson(json, typ_arr_books);
                        System.out.println("Böcker har hämtats från servern.");
                    }
                }
                case "2" -> {
                    String json = HttpHelper.getMagazines();

                    if (json != null){
                        Gson gson = new Gson();
                        Type typ_arr_magazines = new TypeToken<ArrayList<Magazine>>(){}.getType();
                        magazines = gson.fromJson(json, typ_arr_magazines);
                        System.out.println("Tidningar har hämtats från servern.");
                    }
                }
                case "3" -> {
                    System.out.println("\n--- Böcker ---");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                }
                case "4" -> {
                    System.out.println("\n--- Tidningar ---");
                    for (Magazine m : magazines) {
                        System.out.println(m);
                    }
                }
                case "5" -> {
                    //Lägger till ett nytt objekt av typen Book lokalt (i listan books)
                    try{
                        String id = System.console().readLine("ID:");
                        String title = System.console().readLine("Titel:");
                        String author = System.console().readLine("Författare:");
                        String genre = System.console().readLine("Genre:");
                        int pages = Integer.parseInt(System.console().readLine("Antal sidor:"));

                        books.add(new Book(id, title, author, genre, pages, true));
                        System.out.println("Bok har lagts till lokalt.");
                    } catch (NumberFormatException e) {
                        System.out.println("Ogiltigt format för antal sidor.");
                    }
                }
                case "6" -> {
                    // Lägger till ett nytt objekt av typen Magazine lokalt (i listan magazines)
                    try {
                        String id= System.console().readLine("ID:");
                        String title = System.console().readLine("Titel:");
                        int issueNumber = Integer.parseInt(System.console().readLine("Nummer:"));
                        String category = System.console().readLine("Kategori:");
                        int publicationYear = Integer.parseInt(System.console().readLine("Utgivningsår:"));

                        magazines.add(new Magazine(id, title, true, issueNumber, category, publicationYear));
                        System.out.println("Tidning har lagts till lokalt.");
                    } catch (NumberFormatException e) {
                        System.out.println("Ogiltigt format för nummer eller år.");

                    }
                }
                case "7" -> running = false;
                default -> System.out.println("Felaktigt val, försök igen.");
            }
        }
    }
}