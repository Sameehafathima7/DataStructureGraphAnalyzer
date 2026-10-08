package datastructuregraphanalyzer;

import java.util.Scanner;

public class QueueOperations {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueOperations(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(int value) {

        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;

        System.out.println(value + " enqueued successfully.");
    }

    // Dequeue
    public void dequeue() {

        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;

        System.out.println(value + " dequeued successfully.");
    }

    // Front
    public void showFront() {

        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Front element: " + queue[front]);
    }

    // Display
    public void display() {

        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }

    // Queue Menu
    public void menu(Scanner scanner) {

        int choice;

        do {
            System.out.println("\n----- QUEUE OPERATIONS -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
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
                    System.out.print("Enter value to enqueue: ");
                    int enqueueValue = scanner.nextInt();
                    enqueue(enqueueValue);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    showFront();
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