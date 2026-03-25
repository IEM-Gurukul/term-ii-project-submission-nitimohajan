[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Library Management System using Object Oriented Programming in Java

## Problem Statement (max 150 words)

Usually in many small schools and colleges, library records are maintained manually and thats why they suffer from lack of accuracy and are prone to lose books, which makes it very difficult to keep track of issued books. Therefore the purpose of this project is to develop a console based Library Management System in Java, in order to make the management of books easy and efficient. The Library Management System will enable librarians to easily add new books , register new members and then issue and return the books and maintain the records. It will be built using the principles of object oriented programming, in order to create a system that is easy to maintain, efficient and highly modular and also improves accuracy in library works.

## Target User

1.School and College Libraries
 2.Local Libraries
 3.Librarians 

## Core Features

1.It will manage book records in the library
 2.It will add and register members
3.It will help in search book by Title/Id
4.It will help to display the available and unavailable books
5.It will help in managing the information of retuning books and update availability 
6.It will help in input validation and error handling 

## OOP Concepts Used

- Abstraction:Core operations (borrow, return, search) are implemented through methods hiding internal logic
- Inheritance:Achieved by creating a base User class and extending it into Member and Admin classes.
- Polymorphism:Method usage across classes and dynamic behavior.
- Collections:Java ArrayList is used to manage lists of books and borrowed books efficiently.

---

## Proposed Architecture Description

The system will be divided into separate classes such as Book, Member, and Library to maintain clear separation of responsibilities and it will use four principles of OOP such as Encapsulation,Inheritance, Polymorphism and Abstraction.Here,the book and member classes will store relevant data, while the library class will manage operations such as adding books, issuing books, and returning books using collections.An abstract base class will define the common member attributes and different member types will extend it to promote code reuse and structured hierarchy.Polymorphism will allow varying borrowing limits for different member categories. Data will be secured through encapsulation.The main class will provide a console based interface for user interaction

## How to Run

1.Open terminal in project folder
2.Navigate to src directory:
cd src
3.Compile all Java files:
javac *.java
4.Run the program:
java Main

## Git Discipline Notes
This project follows proper Git version control practices with multiple meaningful commits.
- Maintained more than 10 commits as required
- Each commit represents a specific feature, fix, or improvement
- Commit messages are clear and descriptive

Commit Progression:

- Initialized project structure
- Added Book class (basic structure)
- Added Member class with borrow/return functionality
- Developed Library class for managing books
- Integrated complete Library Management System
- Improved borrowBook() method with validation and messages
- Improved returnBook() functionality
- Fixed Book class methods for borrow and return operations
- Added available books feature
- Implemented total book count feature
- Created User base class for inheritance
- Added Admin class extending User
- Integrated Admin functionality into the system
- Applied encapsulation to Book class
- updated Member and Library to use encapsulated Book methods for proper OOP concept
- Final UI improvements and output polishing

These commits demonstrate a structured and incremental development process.

