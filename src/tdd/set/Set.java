package tdd.set;

public class Set {

    private static final int DEFAULT_SIZE = 10;

    private int currentIndex = 0;
    Object[] set;

    public Set() {
        set = new Object[DEFAULT_SIZE];
    }

    public Set(int originalSize) {
        set = new Object[originalSize];
    }

    public int maximumSize() {
        return set.length;
    }

    public int size(){
        return currentIndex;
    }

    public Object get(int index) {

        return set[index];
    }

    public void add(Object objectToAdd) {
        if (currentIndex == set.length) {
            increaseSetSize();
        }
        set[currentIndex] = objectToAdd;
        currentIndex++;
    }

    private void increaseSetSize() {
        Object[] temp = set;
        set = new Object[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            set[i] = temp[i];
        }
    }

    public Object remove(int index){
        // Move all items ahead back one
        Object objectToReturn = set[index];
        for(int i = index; i < set.length; i++){
            set[index] = set[index + 1];
        }
        set[set.length - 1] = null;
        currentIndex--;
        return objectToReturn;
    }

    public void clear(){
        set = new Object[set.length];
        currentIndex = 0;
    }
}
