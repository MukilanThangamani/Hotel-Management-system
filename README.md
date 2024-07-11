

# Hotel Management System

This project is a simple console-based Hotel Management System written in Java. It allows hotel staff to manage customers, menu items, and orders efficiently.

## Features

- **Add Customer**: Register new customers.
- **View Customer**: Display information of all registered customers.
- **Add Menu Item**: Add new items to the hotel's menu.
- **View Menu Items**: Display all available menu items.
- **Add Order**: Place new orders linking customers to menu items.
- **View Orders**: Display all orders placed.

## Installation

1. **Clone the repository:**

```bash
git clone https://github.com/yourusername/hotel-management-system.git
```

2. **Navigate to the project directory:**

```bash
cd hotel-management-system
```

3. **Compile the Java files:**

```bash
javac Main.java
```

4. **Run the application:**

```bash
java Main
```

## Usage

Upon running the application, the main menu will be displayed with the following options:

```
======================= *** WELCOME TO HOTEL MANAGEMENT SYSTEM *** =======================

=============================== *** ENTER YOUR CHOICE *** ===============================

1].ADD CUSTOMER                  2].VIEW CUSTOMER
3].ADD MENU ITEM                 4].VIEW MENU ITEMS
5].ADD ORDER                     6].VIEW ORDERS
=============================== *** ENTER 0 TO EXIT *** ===============================
```

Enter the number corresponding to your choice to perform the desired action.

### Adding a Customer

1. Select `1` to add a new customer.
2. Enter the customer's ID, name, and address when prompted.

### Viewing Customers

1. Select `2` to view all registered customers.
2. The details of all customers will be displayed.

### Adding a Menu Item

1. Select `3` to add a new menu item.
2. Enter the menu item's ID, name, and price when prompted.

### Viewing Menu Items

1. Select `4` to view all menu items.
2. The details of all menu items will be displayed.

### Adding an Order

1. Select `5` to add a new order.
2. Enter the order ID, customer ID, and menu item IDs when prompted.

### Viewing Orders

1. Select `6` to view all orders.
2. The details of all orders will be displayed.

## Classes

- **Entity**: The base class for common attributes and methods.
- **Customer**: Represents a customer with additional attributes like address.
- **MenuItem**: Represents a menu item with a price attribute.
- **Order**: Represents an order linking customers to menu items.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.
