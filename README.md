# IT1214 - Warehouse Inventory Management System

## Project Description
The **Warehouse Inventory Management System** is a console-based Java application designed to help warehouse managers track products efficiently. This system utilizes the **Java Collections Framework (ArrayList)** to store and manage items. It follows Object-Oriented Programming (OOP) principles such as Encapsulation and Separation of Concerns by dividing the logic into three primary classes: `Item`, `Inventory`, and `Warehouse`.

## Features
- **Add New Items:** Register products with a unique ID, name, quantity, and price.
- **Remove Items:** Delete products from the inventory using their unique ID.
- **Update Stock:** Modify the quantity of existing products.
- **Search Functionality:** Quickly find items by searching for their ID or Name.
- **Inventory Overview:** Display a formatted list of all items currently in the warehouse.

## Class Structure
- `Item`: Represents the data model (ID, Name, Qty, Price).
- `Inventory`: Handles the collection logic (ArrayList operations).
- `Warehouse`: Manages the user interface and menu-driven interaction.

## How to Run the Program
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/JayodaB/IT1214-Warehouse-Inventory-System.git](https://github.com/JayodaB/IT1214-Warehouse-Inventory-System.git)
    ```
2.  **Navigate to the folder:**
    ```bash
    cd IT1214-Warehouse-Inventory-System
    ```
3.  **Compile the source code:**
    ```bash
    javac Warehouse.java
    ```
4.  **Run the application:**
    ```bash
    java Warehouse
    ```

## Sample Output
```text
--- WAREHOUSE INVENTORY SYSTEM ---
1. Add Item
2. Remove Item
3. Update Stock
4. View Inventory
5. Search Item
6. Exit
Enter choice: 1

Enter ID: P101
Enter Name: Wireless Mouse
Enter Qty: 25
Enter Price: 15.50
Item added successfully!

--- WAREHOUSE INVENTORY STATUS ---
ID: P101  | Name: Wireless Mouse | Quantity: 25   | Price: $15.50