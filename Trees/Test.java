
import java.util.*;
public class Test {

    

    public static void main(String[] args) {
        // Step 1: Change the tree given to you into a Java HashMap
        Map<String, List<String>> tree = new HashMap<>();
        tree.put("S", Arrays.asList("A", "B"));
        tree.put("A", Arrays.asList("B", "C"));
        tree.put("B", Collections.singletonList("C"));
        tree.put("C", Arrays.asList("D", "G"));
        tree.put("D", Collections.singletonList("G"));
        tree.put("G", Collections.emptyList());

        // Initialize all the variables that are going to be used
        Queue<String> queue = new LinkedList<>();
        List<String> output = new ArrayList<>();
        Map<String, Integer> level = new HashMap<>();
        Map<String, String> parent = new HashMap<>();

        // Set initial values for level and parent maps
        for (String node : tree.keySet()) {
            level.put(node, -1);
            parent.put(node, null);
        }

        // Start the algorithm by adding the root node to the queue
        String sNode = "S";
        queue.add(sNode);
        level.put(sNode, 0);

        // Perform breadth-first search
        while (!queue.isEmpty()) {
            String current = queue.poll(); // Dequeue the first node in the queue
            output.add(current);

            for (String neighbor : tree.get(current)) {
                parent.put(neighbor, current);
                level.put(neighbor, level.get(current) + 1);
                queue.add(neighbor);
            }
        }

        // Print the results
        System.out.println("Output: " + output);
        System.out.println("Parent: " + parent);
        System.out.println("Level: " + level);

        // Print the path returned
        String wNode = "G";
        List<String> path = new ArrayList<>();
        while (wNode != null) {
            path.add(wNode);
            wNode = parent.get(wNode);
        }
        Collections.reverse(path);

        // Output path
        System.out.println("==========================================");
        System.out.println("Breadth-first Search Path: " + path);
        // Output path is ["S", "A", "B", "C", "D", "G"]
    }
}

