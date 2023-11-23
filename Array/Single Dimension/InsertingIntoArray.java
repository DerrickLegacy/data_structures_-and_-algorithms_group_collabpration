public class InsertingIntoArray {
    public int location;
    public String name;

    // Method to insert a name into an array at a specified location
    public static void insert(String name, String names[], int location) {
        // Check if the index at the specified location is empty, then add the name there
        if (names[location] == null) {
            names[location] = name;
        } else {
            // If the location is not the last one
            if (location != (names.length - 1)) {
                // Loop to find the first available empty slot after the specified location
                for (int i = location + 1; i < names.length;) {
                    if (names[i] == null) {
                        // Shift elements to make space for the new name
                        for (int k = i; k > location; k--) {
                            names[k] = names[k - 1];
                        }
                        names[location] = name;
                        break;
                    } else {
                        // Print a message if no space is available
                        System.out.println("No space");
                        break;
                    }
                }
            } else {
                // If the location is the last one
                if (names[names.length - 1] == null) {
                    names[location] = name;
                } else {
                    // Loop to find the first available empty slot before the specified location
                    for (int i = location - 1; i >= 0; i--) {
                        if (names[i] == null) {
                            // Shift elements to make space for the new name
                            for (int k = i; k < location; k++) {
                                names[k] = names[k + 1];
                            }
                        }
                    }
                    names[location] = name;
                }
            }
        }
    }

    public static void main(String args[]) {
        // Create an array of strings
        String names[] = new String[3];
        names[0] = "Ariana";
        // names[1] = "Juliet";
        names[2] = "Kayigwa";

        // Insert a new name into the array at a specified location
        insert("Malaika", names, 0);

        // Display the contents of the array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
