package datastructuregraphanalyzer;

import java.util.Scanner;

public class StackOperations {

    private int[] stack;
    private int top;

    public StackOperations(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    // Push
    public void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value + " pushed successfully.");
    }

    // Pop
    public void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }

        int value = stack[top];
        top--;

        System.out.println(value + " popped successfully.");
    }

    // Peek
    public void peek() {

        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    // Display
    public void display() {

        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    // Stack Menu
    public void menu(Scanner scanner) {

        int choice;

        do {
            System.out.println("\n----- STACK OPERATIONS -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back to Main Menu");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int pushValue = scanner.nextInt();
                    push(pushValue);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
