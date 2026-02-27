import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        boolean running = true;

        System.out.println("====================================");
        System.out.println("   Welcome to My Supermarket!");
        System.out.println("====================================");

        while (running) {
            System.out.println();
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add a new product");
            System.out.println("2. List all products and prices");
            System.out.println("3. Sell a product");
            System.out.println("4. Remove a product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (option == 1) {
                System.out.println();
                System.out.println("--- Add New Product ---");
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("  Product name cannot be empty.");
                    continue;
                }

                System.out.print("Enter selling price: ");
                double price = scanner.nextDouble();
                if (price <= 0) {
                    System.out.println("  Product price must be positive.");
                    continue;
                }

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (quantity <= 0) {
                    System.out.println("  Product quantity must be positive.");
                    continue;
                }

                boolean added = inventory.addProduct(name, price, quantity);
                if (added) {
                    System.out.println("  Product '" + name + "' added successfully!");
                } else {
                    System.out.println("  Inventory is full! Cannot add more products (max 5).");
                }

            } else if (option == 2) {
                System.out.println();
                System.out.println("--- Product List ---");
                inventory.listProducts();

            } else if (option == 3) {
                System.out.println();
                System.out.println("--- Sell a Product ---");
                System.out.print("Enter the product name to sell: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("  Product name cannot be empty.");
                    continue;
                }

                System.out.print("Enter quantity to sell: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (quantity <= 0) {
                    System.out.println("  Product quantity must be positive.");
                    continue;
                }

                inventory.sellProduct(name, quantity);

            } else if (option == 4) {
                System.out.println();
                System.out.println("--- Remove a Product ---");
                System.out.print("Enter the product name to remove: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("  Product name cannot be empty.");
                    continue;
                }

                inventory.removeProduct(name);

            } else if (option == 5) {
                running = false;
                System.out.println();
                System.out.println("Thank you for using My Supermarket. Goodbye!");

            } else {
                System.out.println("  Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
