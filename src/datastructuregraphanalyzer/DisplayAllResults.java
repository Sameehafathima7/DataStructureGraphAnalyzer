package datastructuregraphanalyzer;

public class DisplayAllResults {

    public void displayAll() {

        System.out.println("\n==============================================");
        System.out.println("              ALL RESULTS SUMMARY");
        System.out.println("==============================================");

        System.out.println("\n1. ARRAY");
        System.out.println("----------------------------------------------");
        System.out.println("Operations: Insert, Delete, Search, Display");
        System.out.println("Data Structure: Array");
        System.out.println("Main Operations Complexity:");
        System.out.println("- Insert: O(1) average");
        System.out.println("- Delete: O(n)");
        System.out.println("- Search: O(n)");

        System.out.println("\n2. STACK");
        System.out.println("----------------------------------------------");
        System.out.println("Operations: Push, Pop, Peek, Display");
        System.out.println("Data Structure: Stack");
        System.out.println("Principle: LIFO");
        System.out.println("Push Complexity: O(1)");
        System.out.println("Pop Complexity: O(1)");

        System.out.println("\n3. QUEUE");
        System.out.println("----------------------------------------------");
        System.out.println("Operations: Enqueue, Dequeue, Front, Display");
        System.out.println("Data Structure: Circular Queue");
        System.out.println("Principle: FIFO");
        System.out.println("Enqueue Complexity: O(1)");
        System.out.println("Dequeue Complexity: O(1)");

        System.out.println("\n4. LINKED LIST");
        System.out.println("----------------------------------------------");
        System.out.println("Operations: Insert, Delete, Search, Display");
        System.out.println("Data Structure: Singly Linked List");
        System.out.println("Insert Complexity: O(n)");
        System.out.println("Delete Complexity: O(n)");
        System.out.println("Search Complexity: O(n)");

        System.out.println("\n5. SEARCHING");
        System.out.println("----------------------------------------------");
        System.out.println("Algorithms:");
        System.out.println("- Linear Search");
        System.out.println("- Binary Search");
        System.out.println("Linear Search Complexity: O(n)");
        System.out.println("Binary Search Complexity: O(log n)");

        System.out.println("\n6. GRAPH");
        System.out.println("----------------------------------------------");
        System.out.println("Operations:");
        System.out.println("- Add Vertex");
        System.out.println("- Add Edge");
        System.out.println("- Display Graph");
        System.out.println("- BFS Traversal");
        System.out.println("- DFS Traversal");
        System.out.println("BFS Complexity: O(V + E)");
        System.out.println("DFS Complexity: O(V + E)");

        System.out.println("\n7. PERFORMANCE COMPARISON");
        System.out.println("----------------------------------------------");
        System.out.println("Search Performance:");
        System.out.println("- Linear Search: O(n)");
        System.out.println("- Binary Search: O(log n)");

        System.out.println("\nGraph Performance:");
        System.out.println("- BFS: O(V + E)");
        System.out.println("- DFS: O(V + E)");

        System.out.println("\n==============================================");
        System.out.println("        ALL MODULES ARE IMPLEMENTED");
        System.out.println("==============================================");
    }
}