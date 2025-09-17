# Library Management System (CLI)
A lightweight, console-based application for managing a book collection, built with pure Java to demonstrate core object-oriented programming principles.

---

## Features
- CRUD Operations: Add, delete, update, and view books through a simple menu-driven interface.

- In-Memory Storage: Utilizes a HashSet to manage the book collection, ensuring no duplicate entries based on book ID.

- OOP Design: Structured with a clear separation of concerns into three main classes:

- Books: A POJO (Plain Old Java Object) for the data model.

- BookService: Handles all business logic and data manipulation.

- Main: Provides the user-facing command-line interface.

- Input Validation: Includes basic error handling for non-integer inputs to ensure a stable user experience.

---

## Technologies Used
- Language: Java

- Core Concepts: Object-Oriented Programming, Data Structures (HashSet), equals()/hashCode() overriding.

---

## How to Run
Compile the Java files:

javac src/*.java -d out
Run the application from the project root directory:

java -cp out Main
