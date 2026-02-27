# Supermarket Inventory System

## Description

This is a Java console application that simulates the inventory management of a supermarket. It allows the owner to add new products, view selling prices, sell products, and remove sold-out items from the inventory.

The program was built using only basic Object-Oriented Programming (OOP) concepts — **no arrays or lists are used**. Instead, the inventory manages up to 5 product slots through individual variables and `if / else if` control flow.

## Features

- **Add products**: Register new products with a name, selling price, and stock quantity.
- **List products and prices**: Display all available products with their price and current stock.
- **Sell products**: Sell a specified quantity of a product. If the stock reaches 0, the product is automatically removed.
- **Remove products**: Manually remove a product from the inventory.

## Project Structure

```
Supermarket/
├── src/
│   ├── App.java          # Main class with the interactive menu
│   ├── Product.java      # Product class (name, price, quantity)
│   └── Inventory.java    # Inventory class (5 individual product slots)
├── bin/                   # Compiled .class files
└── README.md
```

## Class Design

### `Product`
Represents a single product with three attributes:
- `name` (String) — the product name.
- `price` (double) — the selling price.
- `quantity` (int) — the available stock.

Includes a constructor, getters, and setters.

### `Inventory`
Manages the supermarket's stock using **5 individual variables** (`product1` through `product5`) instead of arrays or lists. Provides the following methods:
- `addProduct(name, price, quantity)` — finds the first empty slot and creates a new `Product`.
- `listProducts()` — prints the name, price, and stock of every non-null product.
- `sellProduct(name, quantity)` — reduces the stock of the specified product. Removes it automatically if stock reaches 0.
- `removeProduct(name)` — sets the specified product slot to `null`.

### `App`
Contains the `main` method. Uses a `Scanner` for user input and a `while` loop to display an interactive menu with 5 options:
1. Add a new product
2. List all products and prices
3. Sell a product
4. Remove a product
5. Exit

## Concepts Used

- **Classes and Objects** (`Product`, `Inventory`)
- **Encapsulation** (private attributes, getters and setters)
- **Conditional statements** (`if`, `else if`, `else`)
- **While loop** (menu loop)
- **Scanner** (user input)

## How to Run

1. **Compile** all source files:
   ```
   javac -d bin src/*.java
   ```
2. **Run** the program:
   ```
   java -cp bin App
   ```
