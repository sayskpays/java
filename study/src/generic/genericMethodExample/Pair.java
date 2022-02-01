package generic.genericMethodExample;

public class Pair<K,V> {
    // Filed
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    // Getter Setter
    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }


}
