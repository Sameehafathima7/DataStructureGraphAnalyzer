package datastructuregraphanalyzer;

import java.util.Scanner;

public class SearchingOperations {

    // Linear Search
    public void linearSearch(int[] array, int target) {

        int steps = 0;

        for (int i = 0; i < array.length; i++) {

            steps++;

            if (array[i] == target) {
                System.out.println("Linear Search: " + target
                        + " found at index " + i);
                System.out.println("Steps: " + steps);
                return;
            }
        }

        System.out.println("Linear Search: " + target + " not found.");
        System.out.println("Steps: " + steps);
    }

    // Binary Search
    public void binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;
        int steps = 0;

        while (left <= right) {

            steps++;

            int middle = (left + right) / 2;

            if (array[middle] == target) {
                System.out.println("Binary Search: " + target
                        + " found at index " + middle);
                System.out.println("Steps: " + steps);
                return;
            }

            if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("Binary Search: " + target + " not found.");
        System.out.println("Steps: " + steps);
    }

    // Display Array
    private void displayArray(int[] array) {

        System.out.print("Array: ");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    // Searching Menu
    public void menu(Scanner scanner) {

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int choice;

        do {
            System.out.println("\n----- SEARCHING OPERATIONS -----");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Display Array");
            System.out.println("4. Back to Main Menu");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to search: ");
                    int linearTarget = scanner.nextInt();
                    linearSearch(array, linearTarget);
                    break;

                case 2:
                    System.out.print("Enter value to search: ");
                    int binaryTarget = scanner.nextInt();
                    binarySearch(array, binaryTarget);
                    break;

                case 3:
                    displayArray(array);
                    break;

                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
