import java.util.Random;

public class TestHashTable {

    public static void main(String[] args) {

        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>(11);
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String name = "Name" + rand.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, i);
        }
        table.printBuckets();
    }
}
