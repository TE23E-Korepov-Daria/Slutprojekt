package com.slutprojet;

import kong.unirest.*;

public class HttpHelper {

    // Hämta böcker från servern
    public static String getBooks() {
        try {
            // Gör om till URL objekt
            String url = "http://10.151.168.5:3130/books";
            // Öppnar koppling till server
            HttpResponse<String> response = Unirest.get(url).asString();

            String json_data = response.getBody();
            // Sparar text läst från servern

            return json_data; // Skickat tillbaka strängen som innehåller json data

        } catch (Exception e) {
            System.out.println("FEl vid GET books" + e.getMessage());
            return null; // Returnerar null om det blev ett fel
        }
    }

    // Hämtar text från URL (magazines) och ger tillbaka texten som en sträng
    public static String getMagazines() {
        try {
            // GÖr om till URL objekt 
            String url = "http://10.151.168.5:3130/magazines";
            // Öppnar koppling till server
            HttpResponse<String> response = Unirest.get(url).asString();

            String json_data = response.getBody();
            //SParar text läst från severn

            return json_data; // Skickar tillbaka strängen som innehåller json data

        } catch (Exception e) {
            System.out.println("Fel vid GET magazines:" + e.getMessage());
            return null; // Returnerar null om det blev ett fel
        }
    }
}