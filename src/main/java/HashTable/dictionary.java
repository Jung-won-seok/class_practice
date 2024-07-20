package HashTable;

import java.util.AbstractMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class dictionary {
    public static class SimpleMap<K, V> extends AbstractMap<K, V> {
        private Set<Entry<K, V>> entries = new HashSet<>();

        @Override
        public Set<Entry<K, V>> entrySet() {
            return entries;
        }

        @Override
        public V put(K key, V value) {
            for (Entry<K, V> entry : entries) {
                if (entry.getKey().equals(key)) {
                    V oldValue = entry.getValue();
                    entry.setValue(value);
                    return oldValue;
                }
            }

            entries.add(new SimpleEntry<>(key, value));
            return null;
        }

        // 간단한 Entry 구현
        private static class SimpleEntry<K, V> implements Entry<K, V> {
            private K key;
            private V value;

            public SimpleEntry(K key, V value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public K getKey() {
                return key;
            }

            @Override
            public V getValue() {
                return value;
            }

            @Override
            public V setValue(V value) {
                V oldValue = this.value;
                this.value = value;
                return oldValue;
            }
        }
    }

    public static void main(String[] args) {
        SimpleMap<String, String> hashTable = new SimpleMap<>();
        int[] hash = {2, 6, 0, 1, 6, 3, 3, 6, 1, 2, 3, 6}; //1월~12월
        LinkedList<Integer> list_0 = new LinkedList<>();

        hashTable.put("January", "1월"); //hash = 0
        hashTable.put("February", "2월");
        hashTable.put("March", "3월");
        hashTable.put("April", "4월");
        hashTable.put("May", "5월");
        hashTable.put("June", "6월");
        hashTable.put("July", "7월");
        hashTable.put("August", "8월");
        hashTable.put("September", "9월");
        hashTable.put("October", "10월");
        hashTable.put("November", "11월");
        hashTable.put("December", "12월");


        System.out.println(hashTable);
        //Set<Entry<String, String>> entrySet = hashTable.entrySet();
        // for (Entry<String, String> entry : entrySet) {
        //   System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
    }
}