import java.util.LinkedList;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class HashTable {

    private static final int MAX_NAME = 256;
    private static final int TABLE_SIZE = 10;

    private static Person[][] hashTable = new Person[TABLE_SIZE][];

    private static int hash(String name) {
        int length = Math.min(name.length(), MAX_NAME);
        int hashValue = 0;
        for (int i = 0; i < length; i++) {
            hashValue = (hashValue * name.charAt(i) + 21) % TABLE_SIZE;
        }
        return hashValue;
    }

    private static void initHashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = new Person[0];
        }
    }

    private static void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (hashTable[i].length == 0) {
                System.out.printf("\t%d\t---\n", i);
            } else {
                for (Person person : hashTable[i]) {
                    System.out.printf("\t%d\t%s\t%d\n", i, person.name, person.age);
                }
            }
        }
    }

    private static boolean hashTableInsert(Person p) {
        if (p == null)
            return false;
        int index = hash(p.name);
        for (Person person : hashTable[index]) {
            if (person.name.equals(p.name)) {
                return false; // Already exists, cannot insert
            }
        }
        Person[] newArray = new Person[hashTable[index].length + 1];
        System.arraycopy(hashTable[index], 0, newArray, 0, hashTable[index].length);
        newArray[hashTable[index].length] = p;
        hashTable[index] = newArray;
        return true;
    }

    private static Person hashTableLookup(String name) {
        int index = hash(name);
        for (Person person : hashTable[index]) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        return null; // Not found
    }

    private static Person hashTableDelete(String name) {
        int index = hash(name);
        for (int i = 0; i < hashTable[index].length; i++) {
            if (hashTable[index][i].name.equals(name)) {
                Person[] newArray = new Person[hashTable[index].length - 1];
                System.arraycopy(hashTable[index], 0, newArray, 0, i);
                System.arraycopy(hashTable[index], i + 1, newArray, i, hashTable[index].length - i - 1);
                Person removedPerson = hashTable[index][i];
                hashTable[index] = newArray;
                return removedPerson;
            }
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
