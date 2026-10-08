package datastructuregraphanalyzer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create objects for all data structures
        ArrayOperations arrayOperations = new ArrayOperations(10);
        StackOperations stackOperations = new StackOperations(10);
        QueueOperations queueOperations = new QueueOperations(10);
        LinkedListOperations linkedListOperations = new LinkedListOperations();
        SearchingOperations searchingOperations = new SearchingOperations();
        GraphOperations graphOperations = new GraphOperations();

        // Performance Analyzer
        PerformanceAnalyzer performanceAnalyzer = new PerformanceAnalyzer();

        // Display All Results
        DisplayAllResults displayAllResults = new DisplayAllResults();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println(" DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("======================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");

            // Input validation
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    arrayOperations.menu(scanner);
                    break;

                case 2:
                    stackOperations.menu(scanner);
                    break;

                case 3:
                    queueOperations.menu(scanner);
                    break;

                case 4:
                    linkedListOperations.menu(scanner);
                    break;

                case 5:
                    searchingOperations.menu(scanner);
                    break;

                case 6:
                    graphOperations.menu(scanner);
                    break;

                case 7:
                    performanceAnalyzer.menu(scanner);
                    break;

                case 8:
                    displayAllResults.displayAll();
                    break;

                case 9:
                    System.out.println("\nThank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-9.");
            }

        } while (choice != 9);

        scanner.close();
    }
}