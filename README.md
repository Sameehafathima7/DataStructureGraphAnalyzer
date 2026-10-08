# Data Structure and Graph Performance Analyzer

## 1. Project Title

**Data Structure and Graph Performance Analyzer**

A Java console-based application developed to demonstrate different data structures, searching algorithms, graph traversal algorithms, and their performance.

---

## 2. Project Overview

The **Data Structure and Graph Performance Analyzer** is a Java console application developed as a practical project for the Data Structures and Algorithms module.

The main purpose of this project is to implement and demonstrate important data structures and algorithms in a single menu-driven application.

The system allows users to perform operations on:

* Arrays
* Stacks
* Queues
* Linked Lists
* Searching algorithms
* Graphs

The application also provides a performance comparison between different searching and graph traversal algorithms using operation counts and execution time.

The project follows basic Object-Oriented Programming principles and uses separate classes for different functionalities.

---

## 3. Team Members

| No. | Name             | Student ID | Role                             |
| --- | ---------------- | ---------- | -------------------------------- |
| 1   | ARF.SAMEEHA      | 23DA2-0943 | Team Leader and Main Integration |
| 2   | JF.SUHA          | 23DA2-0944 | Data Structure Implementation    |
| 3   | AM.RAHNA FARWEEN | 23DA2-0564 | Data Structure and Testing       |
| 4   | AS.ASFA          | 23DA2-0525 | Graph and Performance Analysis   |

---

## 4. Team Responsibilities

### ARF.SAMEEHA - 23DA2-0943

* Team leader
* Main project integration
* Main menu development
* Input validation
* Project structure management
* Integration of all modules
* GitHub repository management
* Final testing
* README documentation

### JF.SUHA - 23DA2-0944

* Data structure implementation
* Contribution to Java source code
* Testing of data structure operations
* Git and GitHub contribution

### AM.RAHNA FARWEEN - 23DA2-0564

* Data structure related tasks
* Testing and verification
* Support for project development

### AS.ASFA - 23DA2-0525

* Graph related tasks
* Performance analysis related tasks
* Testing and documentation support

---

## 5. Technologies Used

* **Programming Language:** Java
* **IDE:** Eclipse IDE
* **Version Control:** Git
* **Repository:** GitHub
* **Application Type:** Console-based Java Application

---

## 6. Data Structures Implemented

The following data structures are implemented in the project:

1. Array
2. Stack
3. Queue
4. Linked List
5. Graph

---

# 7. System Features

## 7.1 Array Operations

The Array module provides the following operations:

* Insert an element
* Delete an element
* Search for an element
* Display all elements
* Input validation
* Full array handling

The array uses a fixed capacity and stores integer values.

---

## 7.2 Stack Operations

The Stack module follows the **LIFO (Last In, First Out)** principle.

Available operations:

* Push
* Pop
* Peek
* Display
* Empty stack handling
* Full stack handling

Example:

```text
Push → Add an element to the top
Pop  → Remove the top element
Peek → View the top element
```

---

## 7.3 Queue Operations

The Queue module follows the **FIFO (First In, First Out)** principle.

Available operations:

* Enqueue
* Dequeue
* Front
* Display
* Empty queue handling
* Full queue handling

Example:

```text
Enqueue → Add an element to the rear
Dequeue → Remove an element from the front
Front   → View the front element
```

---

## 7.4 Linked List Operations

The Linked List module uses nodes to store data.

Available operations:

* Insert
* Delete
* Search
* Display
* Empty list handling

The implementation supports searching for an element and deleting a matching element.

---

## 7.5 Searching Operations

The project implements two searching algorithms:

### Linear Search

Linear Search checks elements one by one until the required value is found or the end of the list is reached.

**Time Complexity:**

```text
O(n)
```

### Binary Search

Binary Search works on a sorted array by repeatedly dividing the search range into two parts.

**Time Complexity:**

```text
O(log n)
```

The system displays:

* Search result
* Number of steps
* Search method

---

# 8. Graph Operations

The Graph module represents a graph using an adjacency list.

The following graph operations are available:

* Add Vertex
* Add Edge
* Display Graph
* Breadth First Search (BFS)
* Depth First Search (DFS)

The graph uses an undirected connection between vertices.

---

## 8.1 Breadth First Search (BFS)

BFS visits vertices level by level.

A Queue is used to manage the vertices that need to be visited.

**Time Complexity:**

```text
O(V + E)
```

Where:

* V = Number of vertices
* E = Number of edges

---

## 8.2 Depth First Search (DFS)

DFS explores one path as deeply as possible before going back and exploring another path.

The project implements DFS using recursion.

**Time Complexity:**

```text
O(V + E)
```

Where:

* V = Number of vertices
* E = Number of edges

---

# 9. Performance Comparison

The project includes a separate performance analysis module.

The performance analyzer compares:

### Searching Algorithms

* Linear Search
* Binary Search

### Graph Traversal Algorithms

* BFS
* DFS

The application measures:

* Number of operation steps
* Execution time
* Search result
* Traversal result
* Time complexity

Execution time is measured using Java's:

```java
System.nanoTime()
```

---

# 10. Time Complexity Analysis

| Data Structure / Algorithm | Operation       | Time Complexity |
| -------------------------- | --------------- | --------------- |
| Array                      | Search          | O(n)            |
| Array                      | Insert          | O(n)            |
| Array                      | Delete          | O(n)            |
| Stack                      | Push            | O(1)            |
| Stack                      | Pop             | O(1)            |
| Stack                      | Peek            | O(1)            |
| Queue                      | Enqueue         | O(1)            |
| Queue                      | Dequeue         | O(1)            |
| Queue                      | Front           | O(1)            |
| Linked List                | Search          | O(n)            |
| Linked List                | Insert          | O(n)            |
| Linked List                | Delete          | O(n)            |
| Linear Search              | Search          | O(n)            |
| Binary Search              | Search          | O(log n)        |
| BFS                        | Graph Traversal | O(V + E)        |
| DFS                        | Graph Traversal | O(V + E)        |

---

# 11. Main Menu

The application provides the following main menu:

```text
======================================
 DATA STRUCTURE & GRAPH ANALYZER
======================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
======================================
```

---

# 12. Project Structure

```text
DataStructureGraphAnalyzer
│
├── src
│   └── datastructuregraphanalyzer
│       │
│       ├── Main.java
│       ├── ArrayOperations.java
│       ├── StackOperations.java
│       ├── QueueOperations.java
│       ├── LinkedListOperations.java
│       ├── SearchingOperations.java
│       ├── GraphOperations.java
│       ├── PerformanceAnalyzer.java
│       └── DisplayAllResults.java
│
├── .gitignore
├── .classpath
└── .project
```

---

# 13. Java Classes

## Main.java

Controls the main application menu and connects all modules.

Responsibilities:

* Display main menu
* Receive user input
* Validate input
* Call each module
* Exit the application

---

## ArrayOperations.java

Handles array-related operations.

Functions include:

* Insert
* Delete
* Search
* Display

---

## StackOperations.java

Implements stack operations using an array.

Functions include:

* Push
* Pop
* Peek
* Display

---

## QueueOperations.java

Implements a circular queue.

Functions include:

* Enqueue
* Dequeue
* Front
* Display

---

## LinkedListOperations.java

Implements a linked list using nodes.

Functions include:

* Insert
* Delete
* Search
* Display

---

## SearchingOperations.java

Implements:

* Linear Search
* Binary Search
* Step counting
* Search result display

---

## GraphOperations.java

Implements graph operations using an adjacency list.

Functions include:

* Add Vertex
* Add Edge
* Display Graph
* BFS
* DFS

---

## PerformanceAnalyzer.java

Measures algorithm performance.

Functions include:

* Linear Search performance
* Binary Search performance
* BFS performance
* DFS performance
* Step count
* Execution time
* Complexity display

---

## DisplayAllResults.java

Provides a summary of the implemented data structures, algorithms, and their time complexities.

---

# 14. Input Validation

The application includes input validation to handle incorrect user input.

For example, if the user enters text instead of a number:

```text
Invalid input! Please enter a number.
```

The system asks the user to enter a valid number.

The main menu also validates the range of choices.

For example:

```text
Invalid choice! Please select 1-9.
```

Empty data structures are also handled safely.

Examples:

```text
Stack is empty!
Queue is empty!
Linked List is empty!
```

---

# 15. Object-Oriented Programming

The project follows basic Object-Oriented Programming concepts.

Different functionalities are separated into different classes.

For example:

* Array operations are handled by `ArrayOperations`
* Stack operations are handled by `StackOperations`
* Queue operations are handled by `QueueOperations`
* Linked List operations are handled by `LinkedListOperations`
* Searching is handled by `SearchingOperations`
* Graph operations are handled by `GraphOperations`
* Performance analysis is handled by `PerformanceAnalyzer`

This separation makes the project easier to understand, test, maintain, and extend.

---

# 16. Error Handling

The application handles common invalid situations such as:

* Invalid menu input
* Non-numeric input
* Invalid menu choices
* Empty stack
* Empty queue
* Empty linked list
* Full array
* Full stack
* Full queue
* Searching for values that do not exist

The system displays suitable messages instead of terminating unexpectedly.

---

# 17. Testing

The application was tested using different input scenarios.

### Array Testing

* Insert values
* Search existing values
* Search non-existing values
* Delete values
* Display values

### Stack Testing

* Push values
* Peek value
* Pop values
* Display stack
* Pop from an empty stack

### Queue Testing

* Enqueue values
* View front
* Dequeue values
* Display queue
* Dequeue from an empty queue

### Linked List Testing

* Insert values
* Search values
* Delete values
* Display list
* Display empty list

### Searching Testing

* Linear search with existing value
* Linear search with non-existing value
* Binary search with existing value
* Binary search with non-existing value

### Graph Testing

* Add vertices
* Add edges
* Display graph
* BFS traversal
* DFS traversal

### Performance Testing

* Linear Search performance
* Binary Search performance
* BFS performance
* DFS performance

---

# 18. Performance Demonstration

The performance analyzer uses a larger dataset for searching algorithms to demonstrate the difference between Linear Search and Binary Search.

For graph performance, a sample graph is created and both BFS and DFS are executed.

The system displays the number of steps and execution time.

Example:

```text
===== LINEAR SEARCH PERFORMANCE =====
Result: Found
Steps: ...
Execution Time: ... ns
Time Complexity: O(n)
```

Example:

```text
===== BINARY SEARCH PERFORMANCE =====
Result: Found
Steps: ...
Execution Time: ... ns
Time Complexity: O(log n)
```

---

# 19. How to Run the Project

### Requirements

* Java JDK
* Eclipse IDE
* Git (optional for cloning from GitHub)

### Steps

1. Open Eclipse IDE.
2. Import or open the `DataStructureGraphAnalyzer` project.
3. Make sure the Java files are inside the package:

```text
datastructuregraphanalyzer
```

4. Open:

```text
Main.java
```

5. Right-click `Main.java`.
6. Select:

```text
Run As → Java Application
```

7. The main menu will appear in the Eclipse Console.
8. Enter the required menu option.
9. Follow the instructions shown by the application.

---

# 20. GitHub Collaboration

Git and GitHub were used for version control and project collaboration.

The project repository contains the source code and project files.

The team uses:

* Git
* GitHub
* Commits
* Branches
* Pull Requests
* Repository management

Each member's contribution is tracked through Git history where applicable.

---

# 21. Repository

**GitHub Repository:**

```text
DataStructureGraphAnalyzer
```

The repository contains the Java source code and supporting project files.

---

# 22. `.gitignore`

The project includes a `.gitignore` file to prevent unnecessary Eclipse-generated and compiled files from being added to version control.

The following files/folders are ignored:

```text
bin/
.settings/
*.class
*.jar
```

---

# 23. Advantages of the System

* Simple console-based interface
* Easy to understand
* Demonstrates multiple data structures
* Demonstrates searching algorithms
* Demonstrates graph traversal
* Includes performance analysis
* Includes time complexity information
* Includes input validation
* Uses separate Java classes
* Supports Git and GitHub collaboration

---

# 24. Limitations

* The application is console-based.
* The system mainly works with integer values for data structure examples.
* Performance results may vary depending on the computer and system environment.
* The application is designed mainly for educational and demonstration purposes.

---

# 25. Future Improvements

Possible future improvements include:

* Adding a graphical user interface
* Supporting larger and dynamic datasets
* Adding AVL Tree implementation
* Adding Hashing implementation
* Adding graph visualization
* Saving performance results to a file
* Adding more advanced performance charts
* Supporting different data types

---

# 26. Conclusion

The **Data Structure and Graph Performance Analyzer** provides a practical demonstration of fundamental data structures and algorithms using Java.

The project implements arrays, stacks, queues, linked lists, searching algorithms, and graph traversal algorithms.

The performance analyzer helps demonstrate the difference between algorithms using operation counts, execution time, and time complexity.

Overall, this project provides practical understanding of how data structures and algorithms are implemented and analyzed in a Java application.

---

## 27. Project Status

**Status:** Completed and Tested

**Application Type:** Java Console Application

**Programming Language:** Java

**Development Environment:** Eclipse IDE

**Version Control:** Git and GitHub
