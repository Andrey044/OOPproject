package ua.opu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Master> masters = new ArrayList<>();
    static ArrayList<Service> services = new ArrayList<>();

    public static void main(String[] args) {
        initializeData();

        Scanner scanner = new Scanner(System.in);

        printMenu();

        while (true) {
            System.out.println("Choose one of operation or <q> to quit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    listMasters();
                    break;
                case "2":
                    listSpecializations();
                    break;
                case "3":
                    listClients();
                    break;
                case "4":
                    listClientsWithReservedService();
                    break;
                case "5":
                    findMostExpensiveService();
                    break;
                case "6":
                    calculateAverageServicePrice();
                    break;
                case "q":
                case "Q":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Ініціалізація даних
    private static void initializeData() {
        Client Cl1 = new Client("Saharova 36 street", "Vova", 98539671L, "CopyTop", 1, "Vova36" , "qwerty", "13:00");
        Client Cl2 = new Client("Usatovo street", "Olexiy", 976921454L, "CopyTop", 2, "Usatuy", "leshka18", "16:00");
        Client Cl3 = new Client("Grigorievskogo Desanta street", "Andrey", 967128438L, "CopyTop", 3, "Anrey04", "ytrewq", "");

        clients.add(Cl1);
        clients.add(Cl2);
        clients.add(Cl3);

        Master M1 = new Master("Vova", "Dneprodoroga 126 street", 912572372L, "CopyTop", "Manager of print", "Vladimir123" , "Vladimir321");
        Master M2 = new Master("Olexiy", "Kirieshkino street", 937954378L, "CopyTop", "Junior Photographer", "Lexa37", "Kirieshkin81");
        Master M3 = new Master("Andrey", "Yuzhnuy street", 927586783L, "CopyTop", "T-Shirt Prints", "Andrey45", "Yuzhnuytop");

        masters.add(M1);
        masters.add(M2);
        masters.add(M3);

        Service S1 = new Service("Print", 25, 1, "Printing", 12);
        Service S2 = new Service("Passport Photo", 50, 2, "Making Photo", 12);
        Service S3 = new Service("T-Shirt Print", 110, 3, "Printing on T-Shirt", 12);

        services.add(S1);
        services.add(S2);
        services.add(S3);
    }

    // Виведення меню
    private static void printMenu() {
        System.out.println("1) Список майстрів");
        System.out.println("2) Список спеціалізацій майстрів");
        System.out.println("3) Список клієнтів");
        System.out.println("4) Кількість клієнтів, яким призначена послуга на вказаний період");
        System.out.println("5) Найдорожча послуга");
        System.out.println("6) Середня вартість послуги");
    }

    // Виведення списку майстрів
    private static void listMasters() {
        for (Master master : masters) {
            System.out.println(master);
        }
    }

    // Виведення списку спеціалізацій майстрів
    private static void listSpecializations() {
        for (Master master : masters) {
            System.out.println(master.getSpecialization());
        }
    }

    // Виведення списку клієнтів
    private static void listClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    // Пошук клієнтів з заброньованою послугою
    private static void listClientsWithReservedService() {
        int count = 0;
        String firstReservedTime = null;
        String secondReservedTime = null;

        for (Client client : clients) {
            String time = client.reservedTime;
            if (!time.isEmpty()) {
                count++;
                if (firstReservedTime == null) {
                    firstReservedTime = time;
                } else if (secondReservedTime == null) {
                    secondReservedTime = time;
                }
            }
        }

        System.out.println("Кількість клієнтів: " + count);
        System.out.println("Час першого клієнта: " + firstReservedTime);
        System.out.println("Час другого клієнта: " + secondReservedTime);
    }

    // Пошук найдорожчої послуги
    private static void findMostExpensiveService() {
        BufferedReader br = null;

                try {
                    File file = new File("TopService.txt");

                    if (!file.exists())
                        file.createNewFile();
                    br = new BufferedReader(new FileReader("TopService.txt"));
                    String list;
                    while ((list = br.readLine()) != null) {
                        System.out.println(list);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error" + e);
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                } finally {
                    try {
                        br.close();
                    }catch (IOException e){
                        System.out.println("Error: " + e);
                    }
                }
    }

    // Розрахунок середньої вартості послуги
    private static void calculateAverageServicePrice() {
        double averagePrice = 0.0;
        int total = 0;

        for (Service service : services) {
            int price = service.price;
            total += price;
        }

        if (services.size() > 0) {
            averagePrice = (double) total / services.size();
        }

        System.out.println("Середня вартість послуг: " + averagePrice);
    }
}