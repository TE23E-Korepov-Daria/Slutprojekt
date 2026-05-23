
package com.slutprojet;

/**Programmet LibSys hämtar böcker och tidningar från servern, sparar dem lokalt i ArrayList och låter användaren lägga till nya objekt lokalt */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String SERVER_URL = "http://10.151.168.5:3130/";

    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Magazine> magazines = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 6) {
            showMenu();

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        fetchBooksFromServer();
                        break;
                    case 2:
                        fetchMagazinesFromServern();
                        break;
                    case 3:
                        printBooksAndMagazines();
                        break;
                    case 4:
                        addBookLocally();
                        break;
                    case 5:
                        addMagazineLocally();
                        break;
                    case 6:
                        System.out.println("Avslutar programmet.");
                        break;
                    default:
                        System.out.println("Fel val! V'lj ett nummer mellan 1 och 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Fel input! Skriv ett nummer!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Hämta böcker från servern");
        System.out.println("2. Hämta tidningar från servern");
        System.out.println("3. Skriv ut alla böcker och tidningar");
        System.out.println("4. Lägg till bok lokalt");
        System.out.println("5. Lägg till tidning lokalt");
        System.out.println("6. Avsluta");
        System.out.println("Välj ett alternativ:");
    }

    private static void fetchBooksFromServer(){
        try {
            String json = sendGetRequest(SERVER_URL + "books");

            books.clear();
            String[] objects = json.split("\\},\\{");

            for (String object : objects) {
                
            }
        }
    }
}