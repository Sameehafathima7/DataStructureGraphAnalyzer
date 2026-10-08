package datastructuregraphanalyzer;

import java.util.*;

public class PerformanceAnalyzer {

    // ==============================
    // Search Performance
    // ==============================
    public void searchPerformance() {

        int[] data = new int[1000];

        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        int target = 1000;

        // Linear Search
        long startLinear = System.nanoTime();

        int linearSteps = 0;
        int linearResult = -1;

        for (int i = 0; i < data.length; i++) {
            linearSteps++;

            if (data[i] == target) {
                linearResult = i;
                break;
            }
        }

        long endLinear = System.nanoTime();

        // Binary Search
        long startBinary = System.nanoTime();

        int low = 0;
        int high = data.length - 1;
        int binarySteps = 0;
        int binaryResult = -1;

        while (low <= high) {

            binarySteps++;

            int mid = (low + high) / 2;

            if (data[mid] == target) {
                binaryResult = mid;
                break;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long endBinary = System.nanoTime();

        System.out.println("\n======================================");
        System.out.println(" SEARCH PERFORMANCE COMPARISON");
        System.out.println("======================================");

        System.out.println("Target Value: " + target);

        System.out.println("\n--- Linear Search ---");
        System.out.println("Result: " + (linearResult != -1 ? "Found" : "Not Found"));
        System.out.println("Steps: " + linearSteps);
        System.out.println("Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Time Complexity: O(n)");

        System.out.println("\n--- Binary Search ---");
        System.out.println("Result: " + (binaryResult != -1 ? "Found" : "Not Found"));
        System.out.println("Steps: " + binarySteps);
        System.out.println("Time: " + (endBinary - startBinary) + " ns");
        System.out.println("Time Complexity: O(log n)");

        System.out.println("\nConclusion:");
        System.out.println("Binary Search uses fewer steps for a sorted array.");
    }


    // ==============================
    // Graph Performance
    // ==============================
    public void graphPerformance() {

        Map<String, List<String>> graph = new LinkedHashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D"));
        graph.put("C", Arrays.asList("A", "D"));
        graph.put("D", Arrays.asList("B", "C", "E"));
        graph.put("E", Arrays.asList("D"));

        // BFS
        long startBFS = System.nanoTime();

        Set<String> visitedBFS = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        visitedBFS.add("A");

        int bfsSteps = 0;

        while (!queue.isEmpty()) {

            String current = queue.poll();
            bfsSteps++;

            for (String neighbour : graph.get(current)) {

                if (!visitedBFS.contains(neighbour)) {
                    visitedBFS.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        long endBFS = System.nanoTime();

        // DFS
        long startDFS = System.nanoTime();

        Set<String> visitedDFS = new LinkedHashSet<>();
        int[] dfsSteps = {0};

        dfs(graph, "A", visitedDFS, dfsSteps);

        long endDFS = System.nanoTime();

        System.out.println("\n======================================");
        System.out.println(" GRAPH PERFORMANCE COMPARISON");
        System.out.println("======================================");

        System.out.println("\n--- BFS ---");
        System.out.println("Visited: " + visitedBFS);
        System.out.println("Steps: " + bfsSteps);
        System.out.println("Time: " + (endBFS - startBFS) + " ns");
        System.out.println("Time Complexity: O(V + E)");

        System.out.println("\n--- DFS ---");
        System.out.println("Visited: " + visitedDFS);
        System.out.println("Steps: " + dfsSteps[0]);
        System.out.println("Time: " + (endDFS - startDFS) + " ns");
        System.out.println("Time Complexity: O(V + E)");

        System.out.println("\nConclusion:");
        System.out.println("Both BFS and DFS have O(V + E) time complexity.");
    }


    // DFS helper method
    private void dfs(
            Map<String, List<String>> graph,
            String current,
            Set<String> visited,
            int[] steps) {

        visited.add(current);
        steps[0]++;

        for (String neighbour : graph.get(current)) {

            if (!visited.contains(neighbour)) {
                dfs(graph, neighbour, visited, steps);
            }
        }
    }


    // ==============================
    // Main Performance Menu
    // ==============================
    public void menu(Scanner scanner) {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println(" PERFORMANCE COMPARISON");
            System.out.println("======================================");
            System.out.println("1. Search Performance");
            System.out.println("2. Graph Performance");
            System.out.println("3. Run All Performance Tests");
            System.out.println("4. Back");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    searchPerformance();
                    break;

                case 2:
                    graphPerformance();
                    break;

                case 3:
                    searchPerformance();
                    graphPerformance();
                    break;

                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }

        } while (choice != 4);
    }
}