# Data Structure and Graph Performance Analyzer

A Java console-based application developed to demonstrate different data structures, searching algorithms, graph traversal algorithms, and their performance.

---

## 1. Project Overview

The **Data Structure and Graph Performance Analyzer** is a Java console application developed as a practical project for the Data Structures and Algorithms module (CIT300).

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

## 2. Team Members

| No. | Name             | Student ID | Role                             |
| --- | ---------------- | ---------- | -------------------------------- |
| 1   | ARF.SAMEEHA      | 23DA2-0943 | Team Leader and Main Integration |
| 2   | JF.SUHA          | 23DA2-0944 | Data Structure Implementation    |
| 3   | AM.RAHNA FARWEEN | 23DA2-0564 | Data Structure and Testing       |
| 4   | AS.ASFA          | 23DA2-0525 | Graph and Performance Analysis   |

---

## 3. Team Responsibilities

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
* Testing and verification of data structure operations
* Support for project development

### AS.ASFA - 23DA2-0525

* Graph related tasks
* Performance analysis related tasks
* Testing and documentation support

---

## 4. Technologies Used

* **Programming Language:** Java
* **IDE:** Eclipse IDE
* **Version Control:** Git
* **Repository:** GitHub
* **Application Type:** Console-based Java Application

---

## 5. Data Structures Implemented

1. Array
2. Stack
3. Queue
4. Linked List
5. Graph

---

## 6. System Features

### 6.1 Array Operations

* Insert an element
* Delete an element
* Search for an element
* Display all elements
* Input validation
* Full array handling

The array uses a fixed capacity and stores integer values.

### 6.2 Stack Operations

The Stack module follows the **LIFO (Last In, First Out)** principle.

* Push
* Pop
* Peek
* Display
* Empty stack handling
* Full stack handling

```text
Push → Add an element to the top
Pop  → Remove the top element
Peek → View the top element
```

### 6.3 Queue Operations

The Queue module follows the **FIFO (First In, First Out)** principle.

* Enqueue
* Dequeue
* Front
* Display
* Empty queue handling
* Full queue handling

```text
Enqueue → Add an element to the rear
Dequeue → Remove an element from the front
Front   → View the front element
```

### 6.4 Linked List Operations

The Linked List module uses nodes to store data.

* Insert
* Delete
* Search
* Display
* Empty list handling

### 6.5 Searching Operations

**Linear Search** checks elements one by one until the required value is found or the end of the list is reached. Time Complexity: `O(n)`

**Binary Search** works on a sorted array by repeatedly dividing the search range into two parts. Time Complexity: `O(log n)`

The system displays the search result, the number of steps, and the search method.

---

## 7. Graph Operations

The Graph module represents a graph using an adjacency list (undirected connections).

* Add Vertex
* Add Edge
* Display Graph
* Breadth First Search (BFS)
* Depth First Search (DFS)

### 7.1 Breadth First Search (BFS)

BFS visits vertices level by level and uses a Queue to manage the vertices to be visited.

Time Complexity: `O(V + E)` (V = vertices, E = edges)

### 7.2 Depth First Search (DFS)

DFS explores one path as deeply as possible before backtracking. It is implemented using recursion.

Time Complexity: `O(V + E)`

---

## 8. Performance Comparison

The performance analyzer compares:

* Linear Search vs Binary Search
* BFS vs DFS

It measures:

* Number of operation steps
* Execution time (using `System.nanoTime()`)
* Search / traversal result
* Time complexity

---

## 9. Time Complexity Analysis

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

## 10. Main Menu

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

## 11. Project Structure

```text
DataStructureGraphAnalyzer
│
├── src
│   └── datastructuregraphanalyzer
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
├── .project
└── README.md
```

---

## 12. Java Classes

| Class                      | Description                                                          |
| -------------------------- | -------------------------------------------------------------------- |
| `Main.java`                | Displays the main menu, validates input, and calls each module       |
| `ArrayOperations.java`     | Insert, delete, search, and display on a fixed-size array            |
| `StackOperations.java`     | Array-based stack with push, pop, peek, and display                  |
| `QueueOperations.java`     | Circular queue with enqueue, dequeue, front, and display             |
| `LinkedListOperations.java`| Node-based linked list with insert, delete, search, and display      |
| `SearchingOperations.java` | Linear and Binary Search with step counting and result display       |
| `GraphOperations.java`     | Adjacency-list graph with add vertex, add edge, display, BFS, DFS    |
| `PerformanceAnalyzer.java` | Measures steps and execution time of searching and traversal methods |
| `DisplayAllResults.java`   | Summary of implemented structures, algorithms, and complexities      |

---

## 13. Input Validation and Error Handling

The application handles incorrect input safely instead of terminating unexpectedly.

```text
Invalid input! Please enter a number.
Invalid choice! Please select 1-9.
Stack is empty!
Queue is empty!
Linked List is empty!
```

Handled situations:

* Non-numeric input
* Invalid menu choices
* Empty stack, queue, and linked list
* Full array, stack, and queue
* Searching for values that do not exist

---

## 14. Object-Oriented Programming

Each functionality is separated into its own class (for example `StackOperations`, `QueueOperations`, `GraphOperations`, `PerformanceAnalyzer`). This makes the project easier to understand, test, maintain, and extend.

---

## 15. Testing

The application was tested using different input scenarios.

* **Array:** insert, search existing / non-existing values, delete, display
* **Stack:** push, peek, pop, display, pop from an empty stack
* **Queue:** enqueue, view front, dequeue, display, dequeue from an empty queue
* **Linked List:** insert, search, delete, display, display empty list
* **Searching:** linear and binary search with existing and non-existing values
* **Graph:** add vertices, add edges, display graph, BFS, DFS
* **Performance:** linear search, binary search, BFS, DFS
* **Graph and Performance:** BFS and DFS results and execution times verified using the sample graph

---

## 16. Performance Demonstration

The performance analyzer uses a larger dataset for the searching algorithms to show the difference between Linear Search and Binary Search. For graph performance, a sample graph is created and both BFS and DFS are executed.

```text
===== LINEAR SEARCH PERFORMANCE =====
Result: Found
Steps: ...
Execution Time: ... ns
Time Complexity: O(n)
```

```text
===== BINARY SEARCH PERFORMANCE =====
Result: Found
Steps: ...
Execution Time: ... ns
Time Complexity: O(log n)
```

---

## 17. How to Run the Project

### Requirements

* Java JDK
* Eclipse IDE
* Git (optional, for cloning from GitHub)

### Steps

1. Open Eclipse IDE.
2. Import or open the `DataStructureGraphAnalyzer` project.
3. Make sure the Java files are inside the package `datastructuregraphanalyzer`.
4. Open `Main.java`.
5. Right-click `Main.java` and select **Run As → Java Application**.
6. The main menu appears in the Eclipse Console.
7. Enter the required menu option and follow the instructions.

---

## 18. GitHub Collaboration

Git and GitHub were used for version control and team collaboration.

* All four members work on the same repository.
* Each commit records the author's name, so every member's contribution is visible in the Git history.
* Commit messages end with the contributor's name, for example:

```text
Reviewed and tested data structure operations - Rahna
Reviewed and tested Graph/BFS operations - Asfa
```

### Useful commands

```text
git status
git add .
git commit -m "message - Name"
git push
git log --format="%an | %s"
```

---

## 19. Repository

**GitHub Repository:** `DataStructureGraphAnalyzer`

The repository contains the Java source code, Eclipse project files, and this documentation.

---

## 20. Advantages

* Simple console-based interface
* Demonstrates multiple data structures, searching algorithms, and graph traversal
* Includes performance analysis and time complexity information
* Includes input validation
* Uses separate Java classes
* Supports Git and GitHub collaboration

---

## 21. Limitations

* The application is console-based.
* The system mainly works with integer values.
* Performance results may vary depending on the computer and environment.
* Designed mainly for educational and demonstration purposes.

---

## 22. Future Improvements

* Graphical user interface
* Larger and dynamic datasets
* AVL Tree and Hashing implementations
* Graph visualization
* Saving performance results to a file
* Advanced performance charts
* Support for different data types

---

## 23. Conclusion

The **Data Structure and Graph Performance Analyzer** provides a practical demonstration of fundamental data structures and algorithms using Java. It implements arrays, stacks, queues, linked lists, searching algorithms, and graph traversal algorithms, and the performance analyzer shows the difference between algorithms using operation counts, execution time, and time complexity.

---

## 24. Project Status

* **Status:** Completed and Tested
* **Application Type:** Java Console Application
* **Programming Language:** Java
* **Development Environment:** Eclipse IDE
* **Version Control:** Git and GitHub