package datastructuregraphanalyzer;

import java.util.*;

public class GraphOperations {

    private Map<String, List<String>> graph;

    public GraphOperations() {
        graph = new LinkedHashMap<>();
    }

    // Add Vertex
    public void addVertex(String vertex) {

        if (graph.containsKey(vertex)) {
            System.out.println("Vertex already exists!");
            return;
        }

        graph.put(vertex, new ArrayList<>());

        System.out.println("Vertex " + vertex + " added successfully.");
    }

    // Add Edge
    public void addEdge(String source, String destination) {

        if (!graph.containsKey(source) || !graph.containsKey(destination)) {
            System.out.println("Both vertices must exist first!");
            return;
        }

        if (!graph.get(source).contains(destination)) {
            graph.get(source).add(destination);
        }

        if (!graph.get(destination).contains(source)) {
            graph.get(destination).add(source);
        }

        System.out.println("Edge added between "
                + source + " and " + destination + ".");
    }

    // Display Graph
    public void displayGraph() {

        if (graph.isEmpty()) {
            System.out.println("Graph is empty!");
            return;
        }

        System.out.println("\n----- GRAPH -----");

        for (String vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");

            for (String neighbour : graph.get(vertex)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }

    // BFS
    public void bfs(String startVertex) {

        if (!graph.containsKey(startVertex)) {
            System.out.println("Vertex not found!");
            return;
        }

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(startVertex);
        visited.add(startVertex);

        System.out.print("BFS: ");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.print(current + " ");

            for (String neighbour : graph.get(current)) {

                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // DFS
    public void dfs(String startVertex) {

        if (!graph.containsKey(startVertex)) {
            System.out.println("Vertex not found!");
            return;
        }

        Set<String> visited = new LinkedHashSet<>();

        System.out.print("DFS: ");

        dfsRecursive(startVertex, visited);

        System.out.println();
    }

    private void dfsRecursive(String vertex, Set<String> visited) {

        visited.add(vertex);

        System.out.print(vertex + " ");

        for (String neighbour : graph.get(vertex)) {

            if (!visited.contains(neighbour)) {
                dfsRecursive(neighbour, visited);
            }
        }
    }

    // Graph Menu
    public void menu(Scanner scanner) {

        int choice;

        do {

            System.out.println("\n----- GRAPH OPERATIONS -----");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS");
            System.out.println("5. DFS");
            System.out.println("6. Back to Main Menu");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter vertex name: ");
                    String vertex = scanner.next();
                    addVertex(vertex);
                    break;

                case 2:
                    System.out.print("Enter source vertex: ");
                    String source = scanner.next();

                    System.out.print("Enter destination vertex: ");
                    String destination = scanner.next();

                    addEdge(source, destination);
                    break;

                case 3:
                    displayGraph();
                    break;

                case 4:
                    System.out.print("Enter starting vertex: ");
                    String bfsStart = scanner.next();
                    bfs(bfsStart);
                    break;

                case 5:
                    System.out.print("Enter starting vertex: ");
                    String dfsStart = scanner.next();
                    dfs(dfsStart);
                    break;

                case 6:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}
