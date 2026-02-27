public class Inventory {
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;
    private Product product5;

    public Inventory() {
        this.product1 = null;
        this.product2 = null;
        this.product3 = null;
        this.product4 = null;
        this.product5 = null;
    }

    public boolean addProduct(String name, double price, int quantity) {
        if (product1 == null) {
            product1 = new Product(name, price, quantity);
            return true;
        } else if (product2 == null) {
            product2 = new Product(name, price, quantity);
            return true;
        } else if (product3 == null) {
            product3 = new Product(name, price, quantity);
            return true;
        } else if (product4 == null) {
            product4 = new Product(name, price, quantity);
            return true;
        } else if (product5 == null) {
            product5 = new Product(name, price, quantity);
            return true;
        } else {
            return false;
        }
    }

    public void listProducts() {
        boolean hasProducts = false;

        if (product1 != null) {
            System.out.println("  - " + product1.getName() + " | Price: $" + product1.getPrice() + " | Stock: "
                    + product1.getQuantity());
            hasProducts = true;
        }
        if (product2 != null) {
            System.out.println("  - " + product2.getName() + " | Price: $" + product2.getPrice() + " | Stock: "
                    + product2.getQuantity());
            hasProducts = true;
        }
        if (product3 != null) {
            System.out.println("  - " + product3.getName() + " | Price: $" + product3.getPrice() + " | Stock: "
                    + product3.getQuantity());
            hasProducts = true;
        }
        if (product4 != null) {
            System.out.println("  - " + product4.getName() + " | Price: $" + product4.getPrice() + " | Stock: "
                    + product4.getQuantity());
            hasProducts = true;
        }
        if (product5 != null) {
            System.out.println("  - " + product5.getName() + " | Price: $" + product5.getPrice() + " | Stock: "
                    + product5.getQuantity());
            hasProducts = true;
        }

        if (!hasProducts) {
            System.out.println("  The inventory is empty.");
        }
    }

    public boolean sellProduct(String name, int quantity) {
        if (product1 != null && product1.getName().equalsIgnoreCase(name)) {
            if (product1.getQuantity() >= quantity) {
                product1.setQuantity(product1.getQuantity() - quantity);
                System.out.println("  Sold " + quantity + " unit(s) of " + product1.getName() + ". Remaining: "
                        + product1.getQuantity());
                if (product1.getQuantity() == 0) {
                    product1 = null;
                    System.out.println("  Product removed from inventory (stock reached 0).");
                }
                return true;
            } else {
                System.out.println("  Not enough stock. Available: " + product1.getQuantity());
                return false;
            }
        } else if (product2 != null && product2.getName().equalsIgnoreCase(name)) {
            if (product2.getQuantity() >= quantity) {
                product2.setQuantity(product2.getQuantity() - quantity);
                System.out.println("  Sold " + quantity + " unit(s) of " + product2.getName() + ". Remaining: "
                        + product2.getQuantity());
                if (product2.getQuantity() == 0) {
                    product2 = null;
                    System.out.println("  Product removed from inventory (stock reached 0).");
                }
                return true;
            } else {
                System.out.println("  Not enough stock. Available: " + product2.getQuantity());
                return false;
            }
        } else if (product3 != null && product3.getName().equalsIgnoreCase(name)) {
            if (product3.getQuantity() >= quantity) {
                product3.setQuantity(product3.getQuantity() - quantity);
                System.out.println("  Sold " + quantity + " unit(s) of " + product3.getName() + ". Remaining: "
                        + product3.getQuantity());
                if (product3.getQuantity() == 0) {
                    product3 = null;
                    System.out.println("  Product removed from inventory (stock reached 0).");
                }
                return true;
            } else {
                System.out.println("  Not enough stock. Available: " + product3.getQuantity());
                return false;
            }
        } else if (product4 != null && product4.getName().equalsIgnoreCase(name)) {
            if (product4.getQuantity() >= quantity) {
                product4.setQuantity(product4.getQuantity() - quantity);
                System.out.println("  Sold " + quantity + " unit(s) of " + product4.getName() + ". Remaining: "
                        + product4.getQuantity());
                if (product4.getQuantity() == 0) {
                    product4 = null;
                    System.out.println("  Product removed from inventory (stock reached 0).");
                }
                return true;
            } else {
                System.out.println("  Not enough stock. Available: " + product4.getQuantity());
                return false;
            }
        } else if (product5 != null && product5.getName().equalsIgnoreCase(name)) {
            if (product5.getQuantity() >= quantity) {
                product5.setQuantity(product5.getQuantity() - quantity);
                System.out.println("  Sold " + quantity + " unit(s) of " + product5.getName() + ". Remaining: "
                        + product5.getQuantity());
                if (product5.getQuantity() == 0) {
                    product5 = null;
                    System.out.println("  Product removed from inventory (stock reached 0).");
                }
                return true;
            } else {
                System.out.println("  Not enough stock. Available: " + product5.getQuantity());
                return false;
            }
        } else {
            System.out.println("  Product '" + name + "' not found in inventory.");
            return false;
        }
    }

    public boolean removeProduct(String name) {
        if (product1 != null && product1.getName().equalsIgnoreCase(name)) {
            System.out.println("  Product '" + product1.getName() + "' removed from inventory.");
            product1 = null;
            return true;
        } else if (product2 != null && product2.getName().equalsIgnoreCase(name)) {
            System.out.println("  Product '" + product2.getName() + "' removed from inventory.");
            product2 = null;
            return true;
        } else if (product3 != null && product3.getName().equalsIgnoreCase(name)) {
            System.out.println("  Product '" + product3.getName() + "' removed from inventory.");
            product3 = null;
            return true;
        } else if (product4 != null && product4.getName().equalsIgnoreCase(name)) {
            System.out.println("  Product '" + product4.getName() + "' removed from inventory.");
            product4 = null;
            return true;
        } else if (product5 != null && product5.getName().equalsIgnoreCase(name)) {
            System.out.println("  Product '" + product5.getName() + "' removed from inventory.");
            product5 = null;
            return true;
        } else {
            System.out.println("  Product '" + name + "' not found in inventory.");
            return false;
        }
    }
}
