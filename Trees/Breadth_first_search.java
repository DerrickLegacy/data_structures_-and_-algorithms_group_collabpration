package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Breadth_first_search {
    public static void main(String[] args) {
        // step1: represent the tree in form of a dictionary using hashmap
        // hashmap is a data structure of key value pairs

        HashMap<String, List<String>> tree = new HashMap<>();
        // add elements in the dictionary using the put method
        tree.put("A", Arrays.asList("B", "C"));
        tree.put("B", Arrays.asList("D", "E"));
        tree.put("C", Arrays.asList("F"));
        tree.put("D", Arrays.asList());
        tree.put("E", Arrays.asList());
        tree.put("F", Arrays.asList("G"));
        tree.put("G", Arrays.asList());

        // step2: declare all the variables we are going to use
        Queue<String> que = new LinkedList<>();// the empty queue
        List<String> output = new ArrayList<>();// the visited nodes
        HashMap<String, String> parent = new HashMap<>();
        HashMap<String, Integer> level = new HashMap<>();

        // step3: initialize the parent and level variables
        for (String nodes : tree.keySet()) {
            parent.put(nodes, null);
            level.put(nodes, -1);
        }

        // step4: test if everything to this point is working
        System.out.println(parent);
        System.out.println(level);

        // yah everything is working so lets continue
        // step5: start the algorithm by declaring A as the root
        String start_node = "A";
        level.put(start_node, 0);
        que.add(start_node); // add A to the queue

        // step5: do the all traversing that implements breadth first search
        while (!que.isEmpty()) {
            String current = que.poll();
            output.add(current);

            // get the children of the current node
            for (String child : tree.get(current)) {
                parent.put(child, current);
                level.put(child, level.get(current) + 1);
                que.add(child); // add the child to the que
            }
        }
        // step6: all looks nice, print out the results now
        System.out.println("======================================");
        System.out.println("Parents: " + parent);
        System.out.println("Levels: " + level);
        System.out.println("Order of traversing: " + output);

        // step7: print out the path returned
        String goal_node = "G";
        List<String> path = new ArrayList<>();
        while (goal_node != null) {
            path.add(goal_node);
            goal_node = parent.get(goal_node);
        }
        Collections.reverse(path);
        System.out.println("======================================");
        System.out.println("Returned path is :" + path);

    }
}