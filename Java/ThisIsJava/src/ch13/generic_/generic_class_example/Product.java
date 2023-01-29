package ch13.generic_.generic_class_example;

public class Product<K, M> {


    //field
    private K kind;
    private M model;

    //method
    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
