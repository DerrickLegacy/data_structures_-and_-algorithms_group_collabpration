class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class HashTable {
    private static final int TABLE_SIZE = 10;
    private static Person[] hashTable = new Person[TABLE_SIZE];

    private static int hash(String name) {
        int length = 0;
        for (int i = 0; i < name.length(); i++) {
            length += (int) name.charAt(i);
        }
        int hashValue = ((length + 1234) % TABLE_SIZE);
        return hashValue;
    }

    private static void initHashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = null; // Initialize to null
        }
    }

    private static void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (hashTable[i] == null) {
                System.out.printf("\t%d\t---\n", i);
            } else {
                System.out.printf("\t%d\t%s\t%d\n", i, hashTable[i].name, hashTable[i].age);
            }
        }
    }

    private static boolean hashTableInsert(Person p) {
        if (p == null)
            return false;

        int index = hash(p.name);

        if (hashTable[index] != null && p.name.equals(hashTable[index].name)) {
            return false; // Already exists, cannot insert
        } else {
            hashTable[index] = p;
            return true;
        }
    }

    private static Person hashTableLookup(String name) {
        int index = hash(name);
        return (hashTable[index] != null && hashTable[index].name.equals(name)) ? hashTable[index] : null;
    }

    private static Person hashTableDelete(String name) {
        int index = hash(name);

        if (hashTable[index] != null && hashTable[index].name.equals(name)) {
            Person removedPerson = hashTable[index];
            hashTable[index] = null;
            return removedPerson;
        }

        return null; // Not found
    }

    public static void main(String[] args) {
        initHashTable();
        printTable();

        Person katie = new Person("Katie", 11);
        Person derrick = new Person("Derrick", 54);
        Person bridget = new Person("Bridget", 12);
        Person oscar = new Person("Oscar", 32);
        Person james = new Person("James", 42);
        Person fik = new Person("Fik", 22);
        Person jason = new Person("Jason", 42);
        Person marios = new Person("Marios", 22);

        hashTableInsert(katie);
        hashTableInsert(derrick);
        hashTableInsert(bridget);
        hashTableInsert(oscar);
        hashTableInsert(james);
        hashTableInsert(fik);
        hashTableInsert(jason);
        hashTableInsert(marios);

        System.out.println("Added people");
        printTable();

        Person tmp = hashTableLookup("Katie");
        if (tmp == null) {
            System.out.println("Not found!");
        } else {
            System.out.printf("Found: \t%s, Age: %d\n", tmp.name, tmp.age);
        }

        hashTableDelete("Katie");
        tmp = hashTableLookup("Katie");
        if (tmp == null) {
            System.out.println("Not found!");
        } else {
            System.out.printf("Found: \t%s, Age: %d\n", tmp.name, tmp.age);
        }
        printTable();
    }
}
