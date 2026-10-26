# Inventory-Management-System
Spring Boot REST API for Inventory Management using Hibernate, MySQL, and Postman
# Inventory Management System

A REST API project developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL. It allows users to create, view, update, and delete inventory products.

## Technologies Used
- Java 21
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Hibernate ORM
- MySQL 8.0
- Maven
- Postman
- Eclipse IDE

## Features
- Add a new product
- View all products
- Retrieve a product by ID
- Update product details
- Delete a product
- Store product information in a MySQL database

## Product Details
Each product contains:
- ID
- Name
- Category
- Quantity
- Price

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/products` | Add a product |
| GET | `/api/products` | View all products |
| GET | `/api/products/{id}` | View a product by ID |
| PUT | `/api/products/{id}` | Update a product |
| DELETE | `/api/products/{id}` | Delete a product |

## Sample Product JSON

```json
{
  "name": "Keyboard",
  "category": "Electronics",
  "quantity": 10,
  "price": 1200
}
```

## Database Configuration
Create a MySQL database named `inventory_db`.

Configure the database connection in `src/main/resources/application.properties`. Set your own MySQL username and password locally. Do not publish real database credentials.

## How to Run
1. Install Java 21 and Eclipse IDE.
2. Install and start MySQL Server.
3. Create the `inventory_db` database.
4. Configure `application.properties` with your local database credentials.
5. Import the project into Eclipse as an existing Maven project.
6. Run `InventorymanagementApplication.java`.
7. Use Postman to test the API endpoints at `http://localhost:8080`.

## Testing
The API was tested using Postman. Successful tests included creating, retrieving, updating, and deleting products. MySQL Workbench was used to verify database records.

## Screenshots
Project screenshots are available in this repository, including the project structure, API requests and responses, and MySQL verification.

## Author
Java Development Project — Inventory Management System
