package generic.genericMultiType;

public class GenericMultiType01<T,M> {
    private T name;
    private M gender;

    public T getName() {
        return this.name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getGender() {
        return this.gender;
    }

    public void setGender(M gender) {
        this.gender = gender;
    }

    
}
