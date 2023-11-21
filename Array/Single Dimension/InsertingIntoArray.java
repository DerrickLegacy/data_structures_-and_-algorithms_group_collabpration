public class InsertingIntoArray {
    public int location;
    public String name;

    public static void insert(String name, String names[], int location) {
        if (names[location] == null) {
            names[location] = name;
        } else {
            if (location != (names.length - 1)) {
                for (int i = location + 1; i < names.length;) {
                    if (names[i] == null) {
                        // Shifting elements.
                        for (int k = i; k > location; k--) {
                            names[k] = names[k - 1];
                        }
                        names[location] = name;
                        break;
                    } else {
                        System.out.println("No space");
                        break;
                    }
                }
            } else {
                if (names[names.length - 1] == null) {
                    names[location] = name;
                } else {
                    for (int i = location - 1; i >= 0; i--) {
                        if (names[i] == null) {
                            // Shifting elements.
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
        String names[] = new String[3];
        names[0] = "Ariana";
        // names[1] = "Juliet";
        names[2] = "Kayigwa";

        insert("Malaika", names, 2);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
