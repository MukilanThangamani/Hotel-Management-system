import java.util.Scanner;

// Main class with the main menu and interaction logic
public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO FOOD ORDER SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD CUSTOMER \t\t\t 2].VIEW CUSTOMER");
        System.out.println("3].ADD MENU ITEM \t\t 4].VIEW MENU ITEMS");
        System.out.println("5].ADD ORDER\t\t\t 6].VIEW ORDERS");
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customers[] = new Customer[5];
        MenuItem menuItems[] = new MenuItem[5];
        Order orders[] = new Order[5];

        int customer_counter = 0;
        int menu_item_counter = 0;
        int order_counter = 0;
        int choice = 100;

        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            while (choice != 0) {
                switch (choice) {
                    case 1:
                        customers[customer_counter] = new Customer();
                        customers[customer_counter].set_details(sc);
                        customer_counter++;
                        break;
                    case 2:
                        for (int i = 0; i < customer_counter; i++) {
                            customers[i].get_details();
                        }
                        break;
                    case 3:
                        menuItems[menu_item_counter] = new MenuItem();
                        menuItems[menu_item_counter].set_details(sc);
                        menu_item_counter++;
                        break;
                    case 4:
                        for (int i = 0; i < menu_item_counter; i++) {
                            menuItems[i].get_details();
                        }
                        break;
                    case 5:
                        orders[order_counter] = new Order();
                        orders[order_counter].set_details(sc);
                        order_counter++;
                        break;
                    case 6:
                        for (int i = 0; i < order_counter; i++) {
                            orders[i].get_details();
                        }
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
                main_menu();
                choice = sc.nextInt();
            }
        }
        sc.close();
    }
}

// Base class for common attributes and methods
class Entity {
    String id;
    String name;

    public String get_id() {
        return id;
    }

    public void get_details() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public void set_details(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
    }
}

// Customer class
class Customer extends Entity {
    String address;

    @Override
    public void get_details() {
        super.get_details();
        System.out.println("Address: " + address);
    }

    @Override
    public void set_details(Scanner sc) {
        super.set_details(sc);
        System.out.print("Address: ");
        address = sc.nextLine();
    }
}

// MenuItem class
class MenuItem extends Entity {
    double price;

    @Override
    public void get_details() {
        super.get_details();
        System.out.println("Price: $" + price);
    }

    @Override
    public void set_details(Scanner sc) {
        super.set_details(sc);
        System.out.print("Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // Consume the remaining newline
    }
}

// Order class
class Order extends Entity {
    String customerId;
    String[] itemIds = new String[5]; // Assuming 5 items per order

    @Override
    public void get_details() {
        super.get_details();
        System.out.println("Customer ID: " + customerId);
        System.out.print("Items: ");
        for (String itemId : itemIds) {
            if (itemId != null) {
                System.out.print(itemId + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void set_details(Scanner sc) {
        super.set_details(sc);
        System.out.print("Customer ID: ");
        customerId = sc.nextLine();
        for (int i = 0; i < itemIds.length; i++) {
            System.out.print("Enter item ID for item " + (i + 1) + ": ");
            itemIds[i] = sc.nextLine();
        }
    }
}
