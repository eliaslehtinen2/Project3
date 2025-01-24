package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Safe safe = new Safe ("0000");
        boolean exit = false;

        while (!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Anna uusi PIN-koodi: ");
                    String newPin = scanner.nextLine();
                    safe.changePin(newPin);
                    break;
            
                case 2:
                    System.out.println("Anna kansioon lisättävä tieto: ");
                    String data = scanner.nextLine();
                    safe.addData(data);
                    break;
                
                case 3:
                    System.out.println("Anna PIN-koodi: ");
                    String inputPin = scanner.nextLine();
                    ArrayList<String> dataList = safe.listData(inputPin);
                    if (dataList != null) {
                        for (String thing : dataList) {
                            System.out.println(thing);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä. ");
                    exit = true;
                    break;
                
                default:
                    System.out.println("Virheellinen valinta, yritä uudelleen.");
                
                }

            }

            scanner.close();

    }
}
