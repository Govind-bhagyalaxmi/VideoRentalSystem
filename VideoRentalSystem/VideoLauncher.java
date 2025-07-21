import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter video name to add: ");
                    String nameToAdd = scanner.nextLine();
                    store.addVideo(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter video name to checkout: ");
                    String nameToCheckout = scanner.nextLine();
                    store.doCheckout(nameToCheckout);
                    break;
                case 3:
                    System.out.print("Enter video name to return: ");
                    String nameToReturn = scanner.nextLine();
                    store.doReturn(nameToReturn);
                    break;
                case 4:
                    System.out.print("Enter video name to rate: ");
                    String nameToRate = scanner.nextLine();
                    System.out.print("Enter rating (1-10): ");
                    int rating = scanner.nextInt();
                    store.receiveRating(nameToRate, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter between 1 and 6.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
